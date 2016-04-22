package com.javase.adapter;

public class AdapterTest {

	public static void main(String[] args) {
		Source source = new Source();
		Adapter adapter = new Adapter(source);
		adapter.method1();
		adapter.method2();
	}

}
