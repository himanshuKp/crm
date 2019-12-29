package com.himanshu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.himanshu.dao.CustomerDAO;
import com.himanshu.entity.Customer;

/**
 * @author root
 *	inject dao to controller
 */
@Controller
@RequestMapping("customer")
public class CustomerController {

//	need to inject the customer dao
	@Autowired
	private CustomerDAO customerDAO;
	
	@RequestMapping("list")
	public String listCustomers(Model theModel) {
		
//		get the customer from dao
		List<Customer> theCustomers = customerDAO.getCustomers();
		
//		add the customer to the model
		theModel.addAttribute("customers",theCustomers);
		
		return "list-customer";
	}
	
}
