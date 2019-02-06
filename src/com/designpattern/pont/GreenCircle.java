package com.designpattern.pont;

public class GreenCircle implements IDrawAPI, IConstantes {

	@Override
	public void drawCircle(int radius, int x, int y) {
		
	     System.out.println(MESSAGE_CIRCLE + OUVERTURE_CROCHET + COLOR_GREEN + radius + COORDONNEES_X + x +SEPARATOR + COORDONNEES_Y + y + FERMETURE_CROCHET);


	}
}
