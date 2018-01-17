package com.dongnao.aop.demo3;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * 
 * @author Five老师
 * @createTime 2017年12月8日 上午10:38:45
 * @redame @AspectJ注解驱动的切面 优化
 */
@Aspect
public class AopDemo2 {

	@Pointcut("execution(** com.dongnao.aop.demo3.Computer.work(..))")
	public void aopDemo(){
		
	}
	
	@Before("aopDemo()")
	public void aopMethodBefor(){
		System.out.println("Befor the system work, do something.");
	}
	
	@After("aopDemo()")
	public void aopMethodAfter(){
		System.out.println("After the system work, do something.");
	}
	
	@AfterThrowing("aopDemo()")
	public void aopMethod(){
		System.out.println("After the system work error, do something.");
	}
}
