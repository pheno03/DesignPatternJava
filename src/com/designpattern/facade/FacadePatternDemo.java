

package com.designpattern.facade;

/**
 * Le motif de facade masque les complexités du systeme et fournit une interface au client
 */
public class FacadePatternDemo {

	public static void main(String[] args) {
		 ShapeMaker shapeMaker = new ShapeMaker();
		 
		 shapeMaker.drawCircle();
		 shapeMaker.drawRectangle();
		 shapeMaker.drawSquare();

	}

}
