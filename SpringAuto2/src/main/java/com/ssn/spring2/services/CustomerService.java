package com.ssn.spring2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ssn.spring2.dao.CustomerDAO;

@Component
public class CustomerService {
	@Autowired
	CustomerDAO customerDAO;
	
	@Override
	public String toString(){
		return "CustomerDAO [customerDAO=" + customerDAO + "]";
	}
}
