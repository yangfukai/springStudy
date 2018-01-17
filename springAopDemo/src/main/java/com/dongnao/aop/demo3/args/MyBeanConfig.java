package com.dongnao.aop.demo3.args;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 
 * @author Five老师
 * @createTime 2017年12月8日 上午11:00:23
 * 
 */
@Configuration
@EnableAspectJAutoProxy
public class MyBeanConfig {

	@Bean
	public AopDemo aopDemo(){
		return new AopDemo();
	}
	
	@Bean
	public ComputerSystem system(){
		return new Windows7();
	}
	
	@Bean
	public Computer computer(){
		return new Computer(system());
	}
}
