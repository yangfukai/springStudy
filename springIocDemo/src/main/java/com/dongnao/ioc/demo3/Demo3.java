package com.dongnao.ioc.demo3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author Five老师
 * @createTime 2017年12月7日 下午6:02:46
 * @redame Spring容器来管理对象依赖关系，松耦合
 */
public class Demo3 {
	
	//XML装配Bean
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springConfig3.xml");
		Computer computer = (Computer) context.getBean("computer");
		computer.work();
	}
	
}
