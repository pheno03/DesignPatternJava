package com.designpattern.prototype;

public class PrototypePatterneDemo {
	static final String SHAPE_FORME = "Shape : ";

	public static void main(String[] args) {

		ShapeCache.loadCache();

		Shape clonedShape = (Shape) ShapeCache.getShape("1");
		System.out.println(SHAPE_FORME + clonedShape.getType());

		Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
		System.out.println(SHAPE_FORME + clonedShape2.getType());

		Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
		System.out.println(SHAPE_FORME + clonedShape3.getType());

	}
}
