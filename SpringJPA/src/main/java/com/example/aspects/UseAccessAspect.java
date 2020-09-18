package com.example.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//@Aspect
//@Configuration
//public class UseAccessAspect {
//	private Logger logger = LoggerFactory.getLogger(this.getClass());
//	//What kind of method calls I would intercept
//		//execution(* PACKAGE.*.*(..))
//		
//	//@Before("execution(* com.example.spring.aop.springaop.business.*.*(..))")
////	@Before("execution(* com.example.service.*.*(..))")
//	@Before("com.example.aspects.CommonJoinPointConfig.businessLayerExecution()")
//	public void before(JoinPoint jp) {
//		Object [] args = jp.getArgs();
//		logger.info("Reading argument before method call " + args[0]);
//		
//	}
//	
//	@Before(value = "execution(* com.example.service.EmployeeSerivce.*(..)) and args(id)")  
//	public void beforeSearch(JoinPoint jp, int id) {
//		logger.info("Before method:" + jp.getSignature() + " Search id " + id);  
//		
//		
//	}
//		
//	
//
//}
