package com.designpattern.prototype;

public class Square extends Shape {

	public static final String TYPE_FORME = "Square";
	public static final String MESSAGE_SQUARE = "Inside Square::draw method.";

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println(MESSAGE_SQUARE);
	}

	public Square() {
		type = TYPE_FORME;
	}

}
