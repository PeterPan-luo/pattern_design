package com.javase.factoryMethod;

public class SmsSenderFactory implements Provider{

	public Sender produce() {
		return new SmsSender();
	}

}
