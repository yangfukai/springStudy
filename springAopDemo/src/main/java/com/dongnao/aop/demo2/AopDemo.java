package com.dongnao.aop.demo2;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 
 * @author Five老师
 * @createTime 2017年12月7日 下午9:56:34
 * @redame 纯POJO切面
 */
public class AopDemo {

	public void aopAfter(){
		try {
			System.out.println("After the system work, do something.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void aopBefor(JoinPoint point){
		System.out.println("Befor the system work, do something.");
	}
	
	public void aopAround(ProceedingJoinPoint proceed) throws Throwable{
		try {
			System.out.println("After the system work, do something."+proceed.getArgs()[0]);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		proceed.proceed();
		try {
			System.out.println("Befor the system work, do something.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
