package com.dongnao.ioc.demo3;

/**
 * 
 * @author Five老师
 * @createTime 2017年12月7日 下午5:56:23
 * 
 */
public class Computer {

	private ComputerSystem system;
	
	public void setSystem(ComputerSystem system) {
		this.system = system;
	}

	public void work(){
		this.system.run();
	}
}
