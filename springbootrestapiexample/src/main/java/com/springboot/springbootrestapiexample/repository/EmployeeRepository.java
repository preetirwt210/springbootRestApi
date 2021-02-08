package com.springboot.springbootrestapiexample.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.springbootrestapiexample.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {


}
