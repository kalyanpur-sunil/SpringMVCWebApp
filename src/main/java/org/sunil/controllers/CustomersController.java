package org.sunil.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.sunil.model.Customer;
import org.sunil.service.CustomerService;

@Controller
@RequestMapping("/customers")
public class CustomersController {

	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(value="all", method=RequestMethod.GET)
	public ModelAndView getCustomers(ModelMap modelMap){
		
		ModelAndView view = new ModelAndView();
		view.setViewName("customers");
		view.addObject("customerList", customerService.getCustomers());
		
		return view;
	}
	
	@RequestMapping(value="customer/{id}", method=RequestMethod.GET)
	public ModelAndView getCustomerInfo(@PathVariable int id){
		Customer customer = customerService.getCustomerInfo(id);
		ModelAndView view = new ModelAndView();
		view.setViewName("customerDetails");
		view.addObject("customer", customer);
		return view;
	}
}
