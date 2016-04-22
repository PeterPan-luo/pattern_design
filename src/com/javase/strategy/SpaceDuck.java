package com.javase.strategy;

import com.javase.strategy.impl.FlyingWithRocket;
import com.javase.strategy.impl.QuackNoVoid;

public class SpaceDuck extends Duck{

	@Override
	public void display() {
		System.out.println("����̫��Ѽ");
		
	}

	public SpaceDuck() {
		super();
		super.setiFlyingStrategy(new FlyingWithRocket(),new QuackNoVoid());
	}
	

}
