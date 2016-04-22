package com.javase.observer;

public class ObserverTest {

	public static void main(String[] args) {
		Subject sub = new MySubject();
		sub.add(new Observer1((AbstractSubject)sub));
		sub.add(new Observer2((AbstractSubject)sub));
		sub.operation();
	}

}
