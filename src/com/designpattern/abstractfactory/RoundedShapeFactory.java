package com.designpattern.abstractfactory;

public class RoundedShapeFactory extends AbstractFactory {

	private static final String FORME_RECTANGLE = "RECTANGLE";
	private static final String FORME_SQUARE = "SQUARE";

	@Override
	Shape getShape(String shapeType) {
		// TODO Auto-generated method stub
		if (shapeType.equalsIgnoreCase(FORME_RECTANGLE)) {
			return new RoundedRectangle();
		} else if (shapeType.equalsIgnoreCase(FORME_SQUARE)) {
			return new RoundedSquare();
		}
		return null;
	}

}
