package com.dongnao.di.demo1;
/**
 * 
 * @author Five老师
 * @createTime 2017年12月7日 下午5:56:23
 * 
 */
public class Computer {

	private Windows98 windows98;
	
	public Computer(){
		this.windows98 = new Windows98();
	}
	
	public void work(){
		this.windows98.run();
	}
}
