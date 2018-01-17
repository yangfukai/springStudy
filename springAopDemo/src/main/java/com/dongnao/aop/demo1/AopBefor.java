package com.dongnao.aop.demo1;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

/**
 * 
 * @author Five老师
 * @createTime 2017年12月7日 下午11:14:28
 * @redame Spring 经典AOP
 */
public class AopBefor implements MethodBeforeAdvice {

	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("Befor the system work, do something.");
	}

}
