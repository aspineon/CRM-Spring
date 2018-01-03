package com.wkrzywiec.crmspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wkrzywiec.crmspring.entity.Customer;
import com.wkrzywiec.crmspring.utils.dao.CustomerDAO;

@Controller
@RequestMapping("/")
public class CustomerController {
	
	@Autowired
	private CustomerDAO customerDAO;

	@RequestMapping("/list")
	public String customerList(Model model){
		
		List<Customer> listCustomer = customerDAO.getCustomers();
		
		
		System.out.println(listCustomer);
		return "customer-list";
	}
}
