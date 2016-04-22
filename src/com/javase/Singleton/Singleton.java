package com.javase.Singleton;

public class Singleton {

	/*private Singleton(){
		
	}
	public static Singleton instance = null;
	public static Singleton getInstance() {
		if (instance == null) {
			synchronized (instance) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}*/
	
	/*私有构造方法，防止被实例化*/
	private Singleton(){};
	
	/*使用一内部类来维护单例*/
	private static class SingletonFactory {
		private static Singleton instance = new Singleton();
	}
	
	/*获取实例*/
	public static Singleton getInstace() {
		return SingletonFactory.instance;
	}
	
	/*如果该对象被用于序列化， 可以保证对象序列化前后保持一致*/
	public Object readResolve() {
		return getInstace();
	}
}
