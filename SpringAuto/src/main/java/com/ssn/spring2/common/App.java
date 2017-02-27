package com.ssn.spring2.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ssn.spring2.services.CustomerService;

public class App {
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"SpringCustomer.xml"});
		
		CustomerService cust = (CustomerService) context.getBean("customerService");
		System.out.println(cust);
	}
}
