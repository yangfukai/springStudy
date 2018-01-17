package com.dongnao.aop.demo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author Five老师
 * @createTime 2017年12月7日 下午10:03:46
 * @redame 纯POJO切面
 */
public class Demo2 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springConfig2.xml");
		Computer computer = (Computer) context.getBean("computer");
		computer.work(1);
	}
}
