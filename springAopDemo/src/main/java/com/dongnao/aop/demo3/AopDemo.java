package com.dongnao.aop.demo3;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * 
 * @author Five老师
 * @createTime 2017年12月8日 上午10:38:45
 * @redame @AspectJ注解驱动的切面
 */
@Aspect
public class AopDemo {

	@Before("execution(** com.dongnao.aop.demo3.Computer.work(..))")
	public void aopMethodBefor(){
		System.out.println("Befor the system work, do something.");
	}
	
	@After("execution(** com.dongnao.aop.demo3.Computer.work(..))")
	public void aopMethodAfter(){
		System.out.println("After the system work, do something.");
	}
	
	@AfterThrowing("execution(** com.dongnao.aop.demo3.Computer.work(..))")
	public void aopMethodError(){
		System.out.println("After the system work error, do something.");
	}
}
