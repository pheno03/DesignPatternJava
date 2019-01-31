package com.designpattern.singleton;

/**
 * Appel d'un objet par un singleton(Pattern)
 * 
 * @author srakotomalala
 *
 */
public class SingletonPatternDemo {

	public static void main(String[] args) {
		// illegal construct
		// compile Time error : The constructor SingleObject is not visible
		// SingleObject objet = new SingleObjet();

		/**
		 * the only object available
		 */
		SingleObject object = SingleObject.getInstance();

		// appel method
		object.showMessage();
	}

}
