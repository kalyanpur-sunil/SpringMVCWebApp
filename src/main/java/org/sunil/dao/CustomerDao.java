package org.sunil.dao;

import java.util.List;

import org.sunil.model.Customer;

public interface CustomerDao {
	public List<Customer> getCustomers();

	public Customer getCustomerInfo(int id);
}
