package com.designpattern.abstractfactory;

public class RoundedSquare implements Shape {

	private static final String MESSAGE_ROUNDED_SQUARE = "Inside RoundedSquare::draw() method.";
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println(MESSAGE_ROUNDED_SQUARE);

	}

}
