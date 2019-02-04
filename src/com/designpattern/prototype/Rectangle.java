package com.designpattern.prototype;

public class Rectangle extends Shape {
	private static final String TYPE_RECTANGLE = "Rectangle";
	private static final String MESSAGE_TYPE_RECTANGLE = "Inside Rectangle::draw() method.";

	public Rectangle() {
		type = TYPE_RECTANGLE;
	}

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println(MESSAGE_TYPE_RECTANGLE);
	}

}
