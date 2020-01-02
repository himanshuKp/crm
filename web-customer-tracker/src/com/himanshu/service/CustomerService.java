package com.himanshu.service;

import java.util.List;

import com.himanshu.entity.Customer;

public interface CustomerService {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);
	
}
