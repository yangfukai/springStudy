package com.dongnao.ioc.demo5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 
 * @author Five老师
 * @createTime 2017年12月7日 下午9:10:16
 * 
 */
@Configuration
public class SystemConfig {

	@Bean
	public ComputerSystem system(){
		return new Windows7();
	}
	
	@Bean
	public Computer computer(){
		return new Computer(system());
	}
}
