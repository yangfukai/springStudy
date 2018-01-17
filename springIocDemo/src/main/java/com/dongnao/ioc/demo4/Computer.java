package com.dongnao.ioc.demo4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * 
 * @author Five老师
 * @createTime 2017年12月7日 下午5:56:23
 * 
 */
@Component
public class Computer {

	private ComputerSystem system;
	
	@Autowired
	@Qualifier("windows98")
	public void setSystem(ComputerSystem system) {
		this.system = system;
	}
	
	
	public void work(){
		this.system.run();
	}

	
}
