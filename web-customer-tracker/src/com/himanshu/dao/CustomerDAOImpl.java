package com.himanshu.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.himanshu.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	// need to inject the session factory
	@Autowired
	private SessionFactory sessionFactory;
			
	@Override
	public List<Customer> getCustomers() {
		
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
				
		// create a query
		Query<Customer> theQuery = 
				currentSession.createQuery("from Customer order by lastName ASC", Customer.class);
		
		// execute query and get result list
		List<Customer> customers = theQuery.getResultList();
				
		// return the results		
		return customers;
	}

	@Override
	public void saveCustomer(Customer theCustomer) {

//	get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
				
		currentSession.saveOrUpdate(theCustomer);
		
	}

	@Override
	public Customer getCustomer(int theId) {
				
//		get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
//		now retrieve/read from database using the primary key
		Customer theCustomer = currentSession.get(Customer.class,theId);
		
		return theCustomer;
		
	}

	@Override
	public void deleteCustomer(int theId) {
		
//		get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
//		now delete the customer from the database
		Query theQuery = currentSession.createQuery("delete from Customer where id=:customerId");
		
		theQuery.setParameter("customerId", theId);
		
		theQuery.executeUpdate();
	}
	
	

}
