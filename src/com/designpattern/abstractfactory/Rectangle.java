package com.designpattern.abstractfactory;

public class Rectangle implements Shape {

	private static final String MESSAGE_RECTANGLE="Inside Rectangle::draw() method.";
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println(MESSAGE_RECTANGLE);
	}

}
