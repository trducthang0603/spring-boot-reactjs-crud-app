package com.example.springbootreactjscrudapp.repository;

import com.example.springbootreactjscrudapp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeReponsitory extends JpaRepository<Employee,Long> {
}
