package com.himanshu.dao;

import java.util.List;

import com.himanshu.entity.Customer;

public interface CustomerDAO {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);
	
}
