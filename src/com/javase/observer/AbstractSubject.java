package com.javase.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractSubject implements Subject {

	private List<Observer> observerList = new ArrayList<Observer>();
	
	public void add(Observer observer) {
		observerList.add(observer);
	}

	public void del(Observer observer) {
		observerList.remove(observer);
	}

	public void notifyObservers() {
		for (Observer observer : observerList) {
			observer.update();
		}
	}

	public void operation() {
		// TODO Auto-generated method stub

	}
	//具体被观察者的状态
	private String subjectState;

	public String getSubjectState() {
		return subjectState;
	}

	public void setSubjectState(String subjectState) {
		this.subjectState = subjectState;
	}
	
}
