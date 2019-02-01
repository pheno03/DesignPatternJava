package com.designpattern.abstractfactory;

/**
 * Une classe pour generer un objet de classe concret.
 * 
 * @author srakotomalala
 *
 */
public abstract class AbstractFactory {
	abstract Shape getShape(String shapeType);

}
