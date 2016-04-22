package com.javase.strategy.impl;

import com.javase.strategy.IFlyingStrategy;

public class FlyingNoWin implements IFlyingStrategy {
		public void performFly() {
			System.out.println("我不会飞行！");
		}
}
