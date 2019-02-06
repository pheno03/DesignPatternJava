package com.designpattern.pont;

public class Circle extends Shape{
	private int radius, x, y;

	protected Circle(int x, int y, int radius, IDrawAPI drawAPI) {
		super(drawAPI);
		 this.x = x;
		 this.y = y;
		 this.radius = radius;
	}

	@Override
	public void draw() {
		drawAPI.drawCircle(radius, x, y);
		
	}
	
}
 
