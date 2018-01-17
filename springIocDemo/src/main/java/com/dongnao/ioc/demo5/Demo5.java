package com.dongnao.ioc.demo5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author Five老师
 * @createTime 2017年12月7日 下午6:02:46
 * @redame Spring容器来管理对象依赖关系，松耦合
 */
public class Demo5 {
	
	//JAVA代码装配Bean:@Configuration
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SystemConfig.class);
		Computer computer = (Computer) context.getBean("computer");
		computer.work();
	}
}
