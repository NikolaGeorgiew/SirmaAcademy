package engine;

import models.Employee;
import service.Service;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EmployeeManager {
    private final Service service;
    private List<Employee> employees;
    Scanner scanner = new Scanner(System.in);

    public EmployeeManager(Service service) {
        this.service = service;
        employees = service.load();
    }

    public void addEmployee(Employee employee) throws IOException {
        employees.add(employee);
        save();
    }

    public boolean editEmployee(int id, String name, String department, String role, double salary) throws IOException {
        for (Employee employee : employees) {
            if (employee.getId() == id && employee.getEndDate() == null) {
                employee.setName(name);
                employee.setDepartment(department);
                employee.setRole(role);
                employee.setSalary(salary);
                save();
                return true;
            }
        }
        return false;
    }

    public void fireEmployee(int id) throws IOException {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                //Flag for firing employee
                employee.setEndDate(LocalDate.now().toString());
                save();
                break;
            }
        }
    }

    //Helper method for listEmployees
    public List<Employee> listActiveEmployees() {
        return employees.stream().filter(employee -> employee.getEndDate() == null).toList();
    }


    public void listEmployees() {
        List<Employee> activeEmployees = listActiveEmployees();
        if (listActiveEmployees().isEmpty()) {
            System.out.println("No active employees available.");
        } else {
            activeEmployees.forEach(System.out::println);
        }
    }

    public void searchEmployees(String searchTerm) {
        //Try to parse searchTerm as an integer for ID search
        try {
            int id = Integer.parseInt(searchTerm);
            List<Employee> results = employees.stream()
                    .filter(e -> e.getEndDate() == null && e.getId() == id)
                    .toList();
            if (results.isEmpty()) {
                System.out.println("No employees found with ID: " + id);
            } else {
                results.forEach(System.out::println);
            }
        } catch (NumberFormatException e) {
            // If searchTerm is not an integer, search by name or department
            List<Employee> results = employees.stream()
                    .filter(empl -> empl.getEndDate() == null && (empl.getName().toLowerCase().contains(searchTerm.toLowerCase()) ||
                            empl.getDepartment().toLowerCase().contains(searchTerm.toLowerCase())))
                    .toList();
            if (results.isEmpty()) {
                System.out.println("No employees found matching: " + searchTerm);
            } else {
                results.forEach(System.out::println);
            }
        }
    }

    public void execute() throws IOException {
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("1. Add Employee");
            System.out.println("2. Edit Employee");
            System.out.println("3. Fire Employee");
            System.out.println("4. List Employees");
            System.out.println("5. Search Employees");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: \n");

            try {
                int choice = Integer.parseInt(scanner.nextLine());

                //More Readable UI
                switch (choice) {
                    //Add Employee logic
                    case 1:
                        System.out.print("Enter ID: ");
                        int id = Integer.parseInt(scanner.nextLine());
                        System.out.print("Enter Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter Department: ");
                        String department = scanner.nextLine();
                        System.out.print("Enter Role: ");
                        String role = scanner.nextLine();
                        //Validating salary
                        double salary = getValidSalary();
                        addEmployee(new Employee(id, name, department, role, salary));
                        break;
                    //Edit Employee logic
                    case 2:
                        System.out.print("Enter ID of employee to edit: ");
                        int editId = Integer.parseInt(scanner.nextLine());
                        //Ensure employee id is existing
                        boolean employeeExists = false;
                        for (Employee employee : employees) {
                            if (employee.getId() == editId && employee.getEndDate() == null) {
                                employeeExists = true;
                                break;
                            }
                        }
                        if (employeeExists) {
                            System.out.print("Enter New Name: ");
                            String newName = scanner.nextLine();
                            System.out.print("Enter New Department: ");
                            String newDepartment = scanner.nextLine();
                            System.out.print("Enter New Role: ");
                            String newRole = scanner.nextLine();
                            //Validating salary
                            double newSalary = getValidSalary();
                            editEmployee(editId, newName, newDepartment, newRole, newSalary);
                        } else {
                            System.out.println("Employee with ID " + editId + " does not exist or is not active.");
                        }
                        break;
                    //Fire Employee logic
                    case 3:
                        System.out.print("Enter ID of employee to fire: ");
                        int fireId = Integer.parseInt(scanner.nextLine());
                        fireEmployee(fireId);
                        break;
                    //List Employee logic
                    case 4:
                        listEmployees();
                        break;
                    //Search Employee by ID, name or department
                    case 5:
                        System.out.print("Enter search term (ID, name, or department): ");
                        String searchTerm = scanner.nextLine();
                        searchEmployees(searchTerm);
                        break;
                    //Exiting
                    case 6:
                        save();
                        System.out.println("Data saved. Exiting...");
                        isRunning = false;
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }

        scanner.close();
    }

    private void save() throws IOException {
        service.save(employees);
    }
    private double getValidSalary() {
        double salary = -1;
        while (salary < 0) {
            try {
                System.out.print("Enter Salary: ");
                salary = Double.parseDouble(scanner.nextLine());
                if (salary < 0) {
                    System.out.println("Salary cannot be negative. Please enter a valid salary.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid salary format. Please enter a valid number.");
            }
        }
        return salary;
    }
}
