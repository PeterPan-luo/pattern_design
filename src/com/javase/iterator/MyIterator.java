package com.javase.iterator;

public class MyIterator implements Iterator {

	private Collection collection;
	int pos = -1;
	
	public MyIterator(Collection collection)
	{
		this.collection = collection;
	}
	public Object previous() {
		if (pos > 0) {
			pos--;
		}
		return collection.get(pos);
	}

	public Object next() {
		if (pos < collection.size() - 1) {
			pos++;
		}
		return collection.get(pos);   
	}

	public boolean hasNext() {
		if (pos < collection.size() - 1) {
			return true;
		}
		return false;
	}

	public Object first() {
		pos= 0;
		return collection.get(pos);
	}

}
