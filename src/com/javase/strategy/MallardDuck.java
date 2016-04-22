package com.javase.strategy;

import com.javase.strategy.impl.FlyingNoWin;
import com.javase.strategy.impl.QuackWithA;

public class MallardDuck extends Duck {

	@Override
	public void display() {
			System.out.println("������ͷѼ");
	}

	public MallardDuck() {
		super();
		super.setiFlyingStrategy(new FlyingNoWin(),new QuackWithA());
	}

	
}
