package com.ssn.spring3.aop.advice;

import java.lang.reflect.*;
import org.springframework.aop.*;

public class HijackAfterMethod implements AfterReturningAdvice{
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable{
		System.out.println("HijackAfterMethod: after method hihacked!");
	}
}
