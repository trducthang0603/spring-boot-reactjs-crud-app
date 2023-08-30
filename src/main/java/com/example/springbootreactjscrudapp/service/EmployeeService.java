package com.example.springbootreactjscrudapp.service;

import com.example.springbootreactjscrudapp.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List<Employee> findAll();

    Optional<Employee> findById(Long id);

    Employee save(Employee employee);

    void delete(Employee employee);
}
