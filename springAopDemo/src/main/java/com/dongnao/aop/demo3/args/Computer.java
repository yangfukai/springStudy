package com.dongnao.aop.demo3.args;

/**
 * 
 * @author Five老师
 * @createTime 2017年12月7日 下午5:56:23
 * 
 */
public class Computer {

	private ComputerSystem system;
	
	//依赖注入---构造注入
	public Computer(ComputerSystem system){
		this.system = system;
	}
	
	public void work(Person person){
		this.system.run();
	}
}
