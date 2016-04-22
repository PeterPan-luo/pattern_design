package com.javase.factoryMethod;

/**
 * 工厂方法接口，用于生产对应的Sender
 * @author Administrator
 *
 */
public interface Provider {
	public Sender produce();
}
