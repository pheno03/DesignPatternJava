package com.designpattern.iterator;

public class IteratorPatternDemo {

	public static void main(String[] args) {
		NameRepository nameRepository = new NameRepository();

		for (IIterator iterator = nameRepository.getIIterator(); iterator.hasNext();) {
			String name = (String) iterator.next();
			System.out.println("Name : " + name);

		}
	}
}
