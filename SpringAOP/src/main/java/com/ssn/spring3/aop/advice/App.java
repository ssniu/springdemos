package com.ssn.spring3.aop.advice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext(
                new String[] { "SpringAOPAdvice.xml" });


        System.out.println("Spring AOP ");
        CustomerService cust = (CustomerService) appContext.getBean("customerServiceProxy");
        System.out.println("*************************");
        cust.printName();
        System.out.println("*************************");
        cust.printURL();
        System.out.println("*************************");

        try {
            cust.printThrowException();
        } catch (Exception e) {

        }

    }

}