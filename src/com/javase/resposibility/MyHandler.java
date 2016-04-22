package com.javase.resposibility;

public class MyHandler extends AbstractHandler implements Handler{

	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MyHandler(String name) {
		super();
		this.name = name;
	}

	public void operator() {
		System.out.println(name + " deal");
		if (getHandler() != null) {
			getHandler().operator();
		}
	}

}
