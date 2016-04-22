package com.javase.command;

public class CommandTest {

	public static void main(String[] args) {
		Receiver receiver = new Receiver();
		MyCommand command = new MyCommand(receiver);
		Invoker invoker = new Invoker(command);
		invoker.action();
	}

}
