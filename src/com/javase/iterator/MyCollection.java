package com.javase.iterator;

public class MyCollection implements Collection {

	public String string[] = {"A", "B", "C", "D", "E", "F"};
	public Iterator iterator() {
		return new MyIterator(this);
	}

	public Object get(int i) {
		if (i >= 0 && i < string.length) {
			return string[i];
		}
		return null;
	}

	public int size() {
		return string.length;
	}

}
