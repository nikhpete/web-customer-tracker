package com.nick.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nick.springdemo.dao.CustomerDao;
import com.nick.springdemo.entity.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerDao customerDao;
	
	@RequestMapping("/list")
	public String listCustomers(Model model) {
		
		List<Customer> list = customerDao.getCustomers();
		System.out.println(list);
		model.addAttribute("customers", list);
		
		return "list-customers";
	}
}
