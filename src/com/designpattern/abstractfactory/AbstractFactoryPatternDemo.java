package com.designpattern.abstractfactory;

public class AbstractFactoryPatternDemo {

	public static final String RECTANGLE = "RECTANGLE";
	public static final String SQUARE = "SQUARE";

	public static void main(String[] args) {
		// get rounded shape factory
		AbstractFactory shapeFactory = FactoryProducer.getFactory(false);

		// get an object of shape Rounded Rectangle
		Shape shapeRectangle = shapeFactory.getShape(RECTANGLE);
		shapeRectangle.draw();

		// get an object of shape Rounded Square and call draw() method of Shape Square
		Shape shapeSquare = shapeFactory.getShape(SQUARE);
		shapeSquare.draw();

		AbstractFactory shapeFactoryNormal = FactoryProducer.getFactory(true);
		// get an object of Shape Rectangle
		Shape shapeRectangleNormal = shapeFactoryNormal.getShape(RECTANGLE);
		// call draw method of Shape Rectangle
		shapeRectangleNormal.draw();
		// get an object of Shape Square
		Shape shapeSquareNormal = shapeFactoryNormal.getShape(SQUARE);
		// call draw method of Shape Square
		shapeSquareNormal.draw();

	}

}
