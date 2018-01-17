package com.dongnao.di.demo2;
/**
 * 
 * @author Five老师
 * @createTime 2017年12月7日 下午6:02:46
 * 
 */
public class Demo2 {
	
	public static void main(String[] args) {
		ComputerSystem system = new Windows2000();
		Computer computer = new Computer(system);
		computer.work();
	}
}
