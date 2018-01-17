package com.dongnao.aop.demo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dongnao.aop.demo2.Computer;

/**
 * 
 * @author Five老师
 * @createTime 2017年12月7日 下午11:13:26
 * @redame Spring 经典AOP
 */
public class Demo1 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springConfig1.xml");
		ComputerSystem system = (ComputerSystem) context.getBean("systemProxy");
		system.run();
	}
}
