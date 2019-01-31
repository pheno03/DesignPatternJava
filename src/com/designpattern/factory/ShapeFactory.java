package com.designpattern.factory;

/**
 * Creation de fabrique pour generer un objet 
 * de la classe concrète 
 * en fonction d'informations données.
 */
public class ShapeFactory {

	// use getShape method to get object of shape
	public Shape getShape(String shapeType) {

		if (shapeType == null) {
			return null;

		}
		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();

		} else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();

		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		return null;
	}

}
