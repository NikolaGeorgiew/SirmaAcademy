package service;

import models.Employee;

import java.io.IOException;
import java.util.List;

public interface Service {
    void save(List<Employee> employees) throws IOException;

    List<Employee> load();
}
