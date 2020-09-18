package com.example.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {
	public CommonJoinPointConfig() {
		
	}
	@Pointcut("execution(* com.example.service.*.*(..))")
	public void businessLayerExecution() {
		
	}
	

}
