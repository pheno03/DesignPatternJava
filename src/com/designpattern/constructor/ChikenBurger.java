package com.designpattern.constructor;

public class ChikenBurger extends Burger {

	@Override
	public String name() {
		return "Chiken Burger";
	}

	@Override
	public float price() {
		return 50.5f;
	}

}
