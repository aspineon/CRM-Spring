package com.wkrzywiec.crmspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.wkrzywiec.crmspring.entity.Customer;
import com.wkrzywiec.crmspring.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;

	@GetMapping("/list")
	public String customerList(Model model){
		
		List<Customer> listCustomer = customerService.getCustomers();
		model.addAttribute("listCustomer", listCustomer);
		
		return "customer-list";
	}
	
	@GetMapping("/showFormAdd")
	public String showFormAdd(Model model){
		
		Customer customer = new Customer();
		model.addAttribute("customer", customer);
		
		return "customer-form";
	}
	
	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer customer){
		customerService.saveCustomer(customer);
		return "redirect:/customer/list";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("customerId") int id, Model model){
		
		Customer customer = customerService.getCustomer(id);
		System.out.println(customer);
		model.addAttribute("customer", customer);
		
		return "customer-form";
	}
	
	@GetMapping("/deleteCustomer")
	public String deleteCustomer(@RequestParam("customerId") int id){
		
		customerService.deleteCustomer(id);		
		return "redirect:/customer/list";
	}
	
	@PostMapping("/searchCustomer")
	public String searchCustomer(@RequestParam("inputSearchCustomer") String searchName,
									Model model){
		
		List<Customer> customerList = customerService.searchCustomer(searchName);
		System.out.println(searchName);
		System.out.println(customerList);
		model.addAttribute("listCustomer", customerList);
		
		return "customer-list";
	}
}
