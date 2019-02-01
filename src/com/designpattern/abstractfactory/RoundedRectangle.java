package com.designpattern.abstractfactory;

public class RoundedRectangle implements Shape {
     
	private static final String MESSAGE_ROUNDED_RECTANGLE = "Inside RoundedRectangle::draw() method.";
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println(MESSAGE_ROUNDED_RECTANGLE);
	}
}
