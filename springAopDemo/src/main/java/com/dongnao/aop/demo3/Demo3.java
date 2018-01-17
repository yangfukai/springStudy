package com.dongnao.aop.demo3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 
 * @author Five老师
 * @createTime 2017年12月8日 上午10:48:35
 * @redame @AspectJ注解驱动的切面
 */
public class Demo3 {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MyBeanConfig.class);
		Computer system = (Computer) context.getBean("computer");
		system.work();
	}
}
