package com.javase.observer;

public class Observer2 implements Observer {

	public void update() {
		
		System.out.println(subject.getSubjectState());
		System.out.println("obsercer2 has recevied");
	}
	
	public Observer2(AbstractSubject subject) {
		super();
		this.subject = subject;
	}
	//获取被观察者的状态
	private AbstractSubject subject;

	public AbstractSubject getSubject() {
		return subject;
	}

	public void setSubject(AbstractSubject subject) {
		this.subject = subject;
	}
	
}
