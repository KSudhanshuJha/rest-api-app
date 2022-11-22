package com.customer.service;

import java.util.List;
import java.util.Optional;

import com.customer.entity.Customer;
import com.customer.exception.ResourceNotFoundException;

public interface CustomerService {

	public List<Customer> getAllCustomers();

	public Optional<Customer> getCustomerById(Long employeeId) throws ResourceNotFoundException;

	public Customer createCustomer(Customer employee);

	public Customer updateCustomer(Customer employee, Long employeeId) throws ResourceNotFoundException;

	public void deleteCustomer(Long employeeId) throws ResourceNotFoundException;

}
