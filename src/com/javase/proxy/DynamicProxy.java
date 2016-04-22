package com.javase.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface Human {
	public void info();
	
	public void fly();
}

/*��������*/
class SuperMan implements Human
{

	public void info() {
		System.out.println("I am super man...");
	}

	public void fly() {
		System.out.println("I believe i can fly...");
	}
	
}
/*���α�������*/
class HumanUtil{
	public void method1() {
		System.out.println("===========method1==========");
	}
	public void method2() {
		System.out.println("==========method2=======");
	}
}
class MyInvocationHandle implements InvocationHandler
{
	Object obj;
	public MyInvocationHandle(Object obj)
	{
		this.obj = obj;
	}
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		//AOP��̻���
		HumanUtil humanUtil = new HumanUtil();
		humanUtil.method1();
		
		Object val = method.invoke(obj, args);
		humanUtil.method2();
		
		return val;
	}
	
}

class ProxyFactory
{
	/*��̬����һ�����������*/
	public static Object getProxyInstance (Object object) {
		MyInvocationHandle handle = new MyInvocationHandle(object);
		return Proxy.newProxyInstance(object.getClass().getClassLoader(), 
				object.getClass().getInterfaces(), handle);
	}
}

class TestAOP{
	
	public static void main(String[] args) {
		SuperMan man = new SuperMan();
		Human human = (Human)ProxyFactory.getProxyInstance(man);
		human.info();
		System.out.println();
		human.fly();
	}
}