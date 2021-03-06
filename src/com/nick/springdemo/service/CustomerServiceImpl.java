package com.nick.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nick.springdemo.dao.CustomerDao;
import com.nick.springdemo.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	CustomerDao customerDao;
	
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		return customerDao.getCustomers();
	}

	@Override
	@Transactional
	public void saveCustomer(Customer customer) {
		customerDao.saveCustomer(customer);
	}

	@Override
	@Transactional
	public Customer getCustomer(int id) {
		return customerDao.getCustomer(id);
	}

	@Override
	@Transactional
	public void deleteCustomer(int id) {
		customerDao.deleteCustomer(id);
	}

	@Override
	@Transactional
	public List<Customer> searchCustomers(String searchName) {
		return customerDao.searchCustomers(searchName);
	}

}
