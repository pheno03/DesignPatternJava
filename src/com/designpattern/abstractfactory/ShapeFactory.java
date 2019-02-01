package com.designpattern.abstractfactory;

public class ShapeFactory extends AbstractFactory {

	private static final String FORME_RECTANLE = "RECTANGLE";
	private static final String FORME_SQUARE = "SQUARE";
	
	@Override
	public Shape getShape(String shapeType) {
		if (shapeType.equalsIgnoreCase(FORME_RECTANLE)) {
			return new Rectangle();
		} else if (shapeType.equalsIgnoreCase(FORME_SQUARE)) {
			return new Square();
		}
		return null;
	}

}
