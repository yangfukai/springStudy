package com.dongnao.aop.demo3.args;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * 
 * @author Five老师
 * @createTime 2017年12月8日 上午10:38:45
 * @redame @AspectJ注解驱动的切面 参数
 */
@Aspect
public class AopDemo {

	@Pointcut("execution(** com.dongnao.aop.demo3.args.Computer.work(..)) && args(arg)")
	public void aopDemo(Person arg){}
	
	@Before("aopDemo(arg)")
	public void aopMethodBefor(Person arg){
		System.out.println("Befor the system work, do something. arg is "+arg.getName());
	}
	
	@After("aopDemo(arg)")
	public void aopMethodAfter(Person arg){
		System.out.println("After the system work, do something. arg is "+arg.getName());
	}
	
	@AfterThrowing("aopDemo(arg)")
	public void aopMethodError(Person arg){
		System.out.println("After the system work error, do something. arg is "+arg.getName());
	}
}
