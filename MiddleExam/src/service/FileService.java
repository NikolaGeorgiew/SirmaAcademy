package service;

import models.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileService implements Service {
    private final String filePath;

    public FileService(String filePath) {
        this.filePath = filePath;
    }


    //Saving the new employee
    @Override
    public void save(List<Employee> employees) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Employee employee : employees) {
                writer.write(employee.getId() + "," + employee.getName() + "," + employee.getStartDate() + ","
                        + employee.getEndDate() + "," + employee.getDepartment() + ","
                        + employee.getRole() + "," + employee.getSalary());
                writer.newLine();
            }

        }
    }

    //Initializing the system with employees from the database
    @Override
    public List<Employee> load() {
        List<Employee> employees = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            //Iterating through the line to take the information for creating the employee
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(",");
                int id = Integer.parseInt(fields[0]);
                String name = fields[1];
                String startDate = fields[2];
                String endDate = fields[3];
                String department = fields[4];
                String role = fields[5];
                double salary = Double.parseDouble(fields[6]);
                //Creating employee
                Employee employee = new Employee(id, name, department, role, salary);
                employee.setStartDate(startDate);
                employee.setEndDate(null); // The flag for the employee still working
                employees.add(employee);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return employees;
    }
}
