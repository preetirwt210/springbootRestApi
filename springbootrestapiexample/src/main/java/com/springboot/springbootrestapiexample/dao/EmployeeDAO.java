package com.springboot.springbootrestapiexample.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.springbootrestapiexample.model.Employee;
import com.springboot.springbootrestapiexample.repository.EmployeeRepository;

@Service
public class EmployeeDAO {

	@Autowired
	EmployeeRepository employeeRepository;
	
	public Employee save(Employee emp) {
		
		return employeeRepository.save(emp);
		
	}
	
	public List<Employee> findAll(){
		return employeeRepository.findAll();
	}
	
	public Employee getOne(Long empid) {
		return employeeRepository.getOne(empid);
	}
	
	public void delete(Employee emp) {
		employeeRepository.delete(emp);
	}
	
	
}
