package com.designpattern.pont;

public class RedCircle implements IDrawAPI,IConstantes {

	public void drawCircle(int radius, int x, int y) {
	     System.out.println(MESSAGE_CIRCLE + OUVERTURE_CROCHET + COLOR_RED + radius + COORDONNEES_X + x +SEPARATOR + COORDONNEES_Y + y + FERMETURE_CROCHET);


	}

}
