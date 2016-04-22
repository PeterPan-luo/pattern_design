package com.javase.factoryMethod;

public class FactoryMethodTest {

	public static void main(String[] args) {
		Provider provider = new MailSenderFactory();
		Sender mailSender = provider.produce();
		mailSender.send();
		System.out.println("==========");
		provider =new SmsSenderFactory();
		Sender smsSender = provider.produce();
		smsSender.send();
	}
}
