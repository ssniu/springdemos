package com.ssn.spring3.aop.advice;

import java.lang.reflect.*;
import org.springframework.aop.*;

public class HijackBeforeMethod implements MethodBeforeAdvice{
	public void before(Method arg0, Object[] args, Object target) throws Throwable{
		System.out.println("HijackBeforeMethod: before method hijacked!");
	}
}
