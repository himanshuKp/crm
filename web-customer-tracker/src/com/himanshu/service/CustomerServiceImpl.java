package com.himanshu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.himanshu.dao.CustomerDAO;
import com.himanshu.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDAO customerDAO;
	
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		
//		delegate calls to dao
		return customerDAO.getCustomers();
		
	}

	@Override
	@Transactional
	public void saveCustomer(Customer theCustomer) {

//		delegate call to save customer to dao
		customerDAO.saveCustomer(theCustomer);
		
	}

	@Override
	@Transactional
	public Customer getCustomer(int theId) {

//		delegate call to get customer to dao
		;
		return customerDAO.getCustomer(theId);
	}

	@Override
	@Transactional
	public void deleteCustomer(int theId) {
		
//		delegate call to delete customer to dao
		customerDAO.deleteCustomer(theId);
	}
	
	

}
