package com.employee.service;

import java.util.List;

import com.employee.entity.Employee;
import com.employee.exception.ResourceNotFoundException;

public interface EmployeeService {
	
	public List < Employee > getAllEmployees();
	
	public Employee getEmployeeById(Long employeeId) throws ResourceNotFoundException;
	
	public Employee createEmployee(Employee employee);
	
	public Employee updateEmployee(Employee employee,Long employeeId) throws ResourceNotFoundException;
	
	public void deleteEmployee(Long employeeId) throws ResourceNotFoundException;
	
}
