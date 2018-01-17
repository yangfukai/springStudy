package com.dongnao.aop.demo1;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

/**
 * 
 * @author Five老师
 * @createTime 2017年12月7日 下午11:15:41
 * @redame Spring 经典AOP
 */
public class AopAfter implements AfterReturningAdvice {

	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("After the system work, do something.");
	}

}
