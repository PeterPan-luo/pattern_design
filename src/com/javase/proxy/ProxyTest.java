package com.javase.proxy;

public class ProxyTest {

	public static void main(String[] args) {
		Sourceable souce = new StatisProxy();
		souce.method();
	}

}
