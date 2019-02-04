package com.designpattern.prototype;

import java.util.Hashtable;

public class ShapeCache {

	private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();

	public static Shape getShape(String sapheId) {
		Shape cacheShape = shapeMap.get(sapheId);
		return (Shape) cacheShape.clone();
	}

	/**
	 * for each shape run database query and create shape shapeMap.put(shapeKey,
	 * shape) for exemple, we are adding three shapes
	 */
	public static void loadCache() {
		Circle circle = new Circle();
		circle.setId("1");
		shapeMap.put(circle.getId(), circle);

		Square square = new Square();
		square.setId("2");
		shapeMap.put(square.getId(), square);

		Rectangle rectangle = new Rectangle();
		rectangle.setId("3");
		shapeMap.put(rectangle.getId(), rectangle);
	}
}
