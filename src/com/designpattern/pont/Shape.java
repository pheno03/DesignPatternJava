package com.designpattern.pont;
/**
 * Une Interface à partir de l'interface IDrawAPI
 * @author srakotomalala
 *
 */

public abstract class Shape {
	protected IDrawAPI drawAPI;

	protected Shape(IDrawAPI drawAPI) {
		this.drawAPI = drawAPI;
	}

	public abstract void draw();

}
