package org.sunil.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.sunil.dao.CustomerDao;
import org.sunil.model.Customer;
import org.sunil.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;
	
	@Override
	public List<Customer> getCustomers() {
		return customerDao.getCustomers();
	}

	@Override
	public Customer getCustomerInfo(int id) {
		return customerDao.getCustomerInfo(id);
	}

}
