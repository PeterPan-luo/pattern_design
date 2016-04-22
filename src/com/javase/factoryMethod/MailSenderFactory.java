package com.javase.factoryMethod;

public class MailSenderFactory implements Provider {

	public Sender produce() {
		return new MailSender();
	}

}
