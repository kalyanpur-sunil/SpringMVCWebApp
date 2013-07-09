package org.sunil.service;

import java.util.List;

import org.sunil.model.Customer;

public interface CustomerService {
	public List<Customer> getCustomers();
	
	public Customer getCustomerInfo(int id);
}
