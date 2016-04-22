package com.javase.proxy;

public class StatisProxy implements Sourceable {

	private Sourceable source;
	
	public StatisProxy()
	{
		super();
		source = new Source();
	}
	
	public void method() {
		beforeProxy();
		source.method();
		afterProxy();
	}

	public void beforeProxy() {
		System.out.println("before proxy...");
	}
	public void afterProxy() {
		System.out.println("after proxy...");
	}
}
