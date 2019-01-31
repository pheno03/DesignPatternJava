package com.designpattern.singleton;

/**
 * Creation d'une seule class pour obtenir son instance statique
 * 
 * @author srakotomalala
 *
 */
public class SingleObject {
	// create an object of SingleObject
	private static SingleObject instance = new SingleObject();

	// make the constructor private so that this class cannot be instanciated
	public SingleObject() {
	}

	// Get the only object availaible
	public static SingleObject getInstance() {
		return instance;

	}

	public void showMessage() {
		System.out.println("Hello World");
	}
}
