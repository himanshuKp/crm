package com.himanshu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.himanshu.dao.CustomerDAO;
import com.himanshu.entity.Customer;
import com.himanshu.service.CustomerService;

/**
 * @author root
 *	inject dao to controller
 */
@Controller
@RequestMapping("customer")
public class CustomerController {

//	need to inject our customer service
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("list")
	public String listCustomers(Model theModel) {
		
//		get the customer from the service
		List<Customer> theCustomers = customerService.getCustomers();
		
//		add the customer to the model
		theModel.addAttribute("customers",theCustomers);
		
		return "list-customer";
	}
	
}
