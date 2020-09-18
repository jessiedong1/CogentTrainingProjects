package com.example.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//@Aspect
//@Configuration
//public class MethoExecutionAspect {
//	private Logger logger = LoggerFactory.getLogger(this.getClass());
//	
//	@Around(value=("com.example.aspects.CommonJoinPointConfig.businessLayerExecution()"))
//	public Object around(ProceedingJoinPoint jp) throws Throwable {
//		long startTime = System.currentTimeMillis();
//		Object obj = jp.proceed();
//		
//		
//		long timeTaken = System.currentTimeMillis()-startTime;
//		logger.info("Time Taken by {} is {}", jp.getArgs()[0], timeTaken);
//		
//		return obj;
//		
//	}
//
//}
