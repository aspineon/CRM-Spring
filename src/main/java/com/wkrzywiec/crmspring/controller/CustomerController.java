package com.wkrzywiec.crmspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class CustomerController {

	@RequestMapping("/list")
	public String customerList(Model model){
		return "customer-list";
	}
}
