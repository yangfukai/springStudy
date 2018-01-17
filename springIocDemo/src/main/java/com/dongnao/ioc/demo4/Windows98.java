package com.dongnao.ioc.demo4;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

/**
 * 
 * @author Five老师
 * @createTime 2017年12月7日 下午5:54:53
 * 
 */
@Component("windows98")
@Scope(value=WebApplicationContext.SCOPE_SESSION, proxyMode=ScopedProxyMode.INTERFACES)
public class Windows98 implements ComputerSystem {
	public void run(){
		System.out.println("电脑工作在Windows 98系统上。");
	}
}
