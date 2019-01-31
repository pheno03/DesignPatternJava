package com.designpattern.factory;

/**
 * Utilisation de Factory pour obtenir un objet
 * 
 * @author srakotomalala
 */
public class FactoryPatternDemo {
	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape factoryCircle = shapeFactory.getShape("CIRCLE");

		factoryCircle.draw();
		
		Shape factoryRectangle = shapeFactory.getShape("RECTANGLE");
		factoryRectangle.draw();
		
		Shape factorySquare = shapeFactory.getShape("SQUARE");
		factorySquare.draw();

	}

}
