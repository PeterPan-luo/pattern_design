package com.javase.observer;

public class Observer1 implements Observer {

	public void update() {
		System.out.println(subject.getSubjectState());
		System.out.println("Observer 1 has received");
	}
	
	public Observer1(AbstractSubject subject) {
		super();
		this.subject = subject;
	}
	
	//获得被观察者的状态
	private AbstractSubject subject;

	public AbstractSubject getSubject() {
		return subject;
	}

	public void setSubject(AbstractSubject subject) {
		this.subject = subject;
	}
	

}
