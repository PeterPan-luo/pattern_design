package com.javase.strategy;

import org.junit.Test;

public class DuckTest {

	@Test
	public void test() {
		System.out.println("²âÊÔÑ¼×Ó³ÌĞò");
		System.out.println("************************");
		Duck duck = null;
		duck = new SpaceDuck();
//		duck = new MallardDuck();
		duck.display();
		duck.quack();
		duck.fly();
		System.out.println("************************");
		System.out.println("²âÊÔÍê±Ï");
	}

}
