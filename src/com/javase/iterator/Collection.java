package com.javase.iterator;

public interface Collection {

	public Iterator iterator();
	
	/*获得集合元素*/
	public Object get(int i);
	
	/*获得集合大小*/
	public int size();
}
