package org.sunil.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.sunil.dao.CustomerDao;
import org.sunil.model.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {

	private static List<Customer> CUSTOMERS = new ArrayList<Customer>(){
		private static final long serialVersionUID = -8334430531451782212L;
		{
			add(new Customer(1, "Henry", "Male"));
			add(new Customer(2, "Scott", "Male"));
			add(new Customer(3, "Edward", "Male"));
			add(new Customer(4, "Angela", "Female"));
		}
	};
	
	@Override
	public List<Customer> getCustomers() {
		return CUSTOMERS;
	}

	@Override
	public Customer getCustomerInfo(int id) {
		Customer customer = null;
		for(Customer cust : CUSTOMERS){
			if(cust.getId()== id){
				return new Customer(cust.getId(), cust.getName(), cust.getGender());
			}
		}
		return customer;
	}

}
