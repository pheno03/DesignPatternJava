package com.designpattern.prototype;

public class Circle extends Shape{
	private static final String TYPE_CIRCLE = "Circle";
	private static final String MESSAGE_TYPE_CIRCLE = "Inside Circle ::draw() methode ";
	
	public Circle() {
	  type=TYPE_CIRCLE;	 
	}

	public void draw() {
		System.out.println(MESSAGE_TYPE_CIRCLE);
	}
}
