package com.example.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//@Aspect
//@Configuration
//public class AfterAopAspect {
//	private Logger logger = LoggerFactory.getLogger(this.getClass());
//	@After(value="com.example.aspects.CommonJoinPointConfig.businessLayerExecution()")
//	public void after(JoinPoint jp) {
//		logger.info("{} Complete the execution {}",jp.toString(),jp.getArgs()[0]);
//	}
//	@AfterReturning(value = "com.example.aspects.CommonJoinPointConfig.businessLayerExecution()", returning = "result")
//	public void afterReturning(JoinPoint jp, Object result)
//	{
//		logger.info("{} arg {} and returned with value {}", jp.toString(), jp.getArgs()[0], result);
//	}
//	
//
//
//}
