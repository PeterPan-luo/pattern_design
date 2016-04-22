package com.javase.strategy;

import com.javase.strategy.impl.FlyingWithWin;
import com.javase.strategy.impl.QuackWithB;

public class RedheadDuck extends Duck {

	@Override
	public void display() {
		System.out.println("���Ǻ�ͷѼ��");

	}

	public RedheadDuck() {
		super();
		super.setiFlyingStrategy(new FlyingWithWin(),new QuackWithB());
	}
	
	

}
