package com.dongnao.ioc.demo4;

import org.springframework.stereotype.Component;

/**
 * 
 * @author Five老师
 * @createTime 2017年12月7日 下午5:54:53
 * 
 */
@Component("windows7")
public class Windows7 implements ComputerSystem {
	public void run(){
		System.out.println("电脑工作在Windows7系统上。");
	}
}
