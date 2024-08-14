import engine.EmployeeManager;
import service.FileService;
import service.Service;

import java.io.IOException;

public class EmployeeManagementApp {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\User\\IdeaProjects\\MiddleExam\\employees";
        Service fileService = new FileService(filePath);
        EmployeeManager manager = new EmployeeManager(fileService);
        System.out.println("Welcome to Employee Management System");

        manager.execute();

    }
}
