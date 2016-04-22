package com.javase.strategy;

public abstract class Duck {

	public abstract void display();
	
	private IFlyingStrategy iFlyingStrategy;
	
	public void setiFlyingStrategy(IFlyingStrategy iFlyingStrategy, IQuackSrategy iQuackSrategy) {
		this.iFlyingStrategy = iFlyingStrategy;
		this.iQuackSrategy = iQuackSrategy;
	}

	public void fly() {
		iFlyingStrategy.performFly();
	}
	
	private IQuackSrategy iQuackSrategy;

	public void setiQuackSrategy(IQuackSrategy iQuackSrategy) {
		this.iQuackSrategy = iQuackSrategy;
	}
	public void quack () {
	    iQuackSrategy.quack();
	}
}
