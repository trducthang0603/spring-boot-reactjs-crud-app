package com.example.springbootreactjscrudapp.service;

import com.example.springbootreactjscrudapp.model.Employee;
import com.example.springbootreactjscrudapp.repository.EmployeeReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeReponsitory employeeRepository;
     @Autowired
    public EmployeeServiceImpl(EmployeeReponsitory employeeRepository){
         this.employeeRepository = employeeRepository;
     }


    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Optional<Employee> findById(Long id) {
        return employeeRepository.findById(id);
    }

    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void delete(Employee employee) {
        employeeRepository.deleteById(employee.getId());
    }
}
