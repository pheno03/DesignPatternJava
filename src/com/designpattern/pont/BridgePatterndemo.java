package com.designpattern.pont;

/**
 * Bridge est utilisé lorsque nous devons dissocier une abstraction de son implémentation 
 * afin que les deux puissent varier indépendamment
 * 
 * utilisation de interface et class abstract
 * @author srakotomalala
 *
 */
public class BridgePatterndemo {

	public static void main(String[] args) {
		Shape redCircle = new Circle(100,100,10, new RedCircle());
		Shape greenCircle = new Circle(100,100,10, new GreenCircle());
		redCircle.draw();
		greenCircle.draw();

	}

}
