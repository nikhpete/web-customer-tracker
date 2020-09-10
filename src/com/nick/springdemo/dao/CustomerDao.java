package com.nick.springdemo.dao;

import java.util.List;

import com.nick.springdemo.entity.Customer;

public interface CustomerDao {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer customer);
	
}
