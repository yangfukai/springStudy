package com.dongnao.ioc.demo4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author Five老师
 * @createTime 2017年12月7日 下午6:02:46
 * @redame Spring注解方式 自动化装配Bean
 */
public class Demo4 {
	
	//注解方式
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springConfig4.xml");
		Computer computer = (Computer) context.getBean("computer");
		computer.work();
	}
	
}
