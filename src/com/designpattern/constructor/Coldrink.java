package com.designpattern.constructor;

public abstract class Coldrink implements Item {

	@Override
	public Packing packing() {
		return new Bottle();
	}

	@Override
	public abstract float price();

}
