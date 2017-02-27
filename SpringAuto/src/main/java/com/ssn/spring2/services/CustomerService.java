package com.ssn.spring2.services;

import com.ssn.spring2.dao.CustomerDAO;

public class CustomerService {
	CustomerDAO customerDAO;
	
	public void setCustomerDAO(CustomerDAO customerDAO){
		this.customerDAO = customerDAO;
		
	}
	@Override 
	public String toString(){
		return "CustomerService [customerDAO= " + customerDAO + "]";
	}
}
