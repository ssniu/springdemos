package com.ssn.spring3.aop.advice;

import org.springframework.aop.*;
import sun.awt.SunToolkit.IllegalThreadException;

public class HijackThrowException implements ThrowsAdvice{
	public void afterThrowing(IllegalArgumentException e) throws Throwable{
		System.out.println("HijackThrowException: Throw exception hijacked!");
	}
}
