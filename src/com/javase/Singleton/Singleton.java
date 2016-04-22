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
	
	/*˽�й��췽������ֹ��ʵ����*/
	private Singleton(){};
	
	/*ʹ��һ�ڲ�����ά������*/
	private static class SingletonFactory {
		private static Singleton instance = new Singleton();
	}
	
	/*��ȡʵ��*/
	public static Singleton getInstace() {
		return SingletonFactory.instance;
	}
	
	/*����ö����������л��� ���Ա�֤�������л�ǰ�󱣳�һ��*/
	public Object readResolve() {
		return getInstace();
	}
}
