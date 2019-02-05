package com.designpattern.adapteur;


/**
 * Une classe concrete  mise en oeuvre du MediaPlayer Interface
 * @author srakotomalala
 *
 */
public class AudioPlayer implements MediaPlayer,ConstantesValeur {
	

	MediaAdapteur mediaAdapteur;

	@Override
	public void play(String audioType, String fileName) {

		// inbuilt support to play mp3 files
		if (audioType.equalsIgnoreCase(TYP_MP3)) {
			 
			System.out.println(FILE_MP3_PLAYING + fileName);
		} else if (audioType.equalsIgnoreCase(TYP_VLC) || audioType.equalsIgnoreCase(TYP_MP4)) {
			mediaAdapteur = new MediaAdapteur(audioType);
			mediaAdapteur.play(audioType, fileName);
		} else {
			System.out.println( MEDIA_INVALID + audioType +FORMAT_NOT_SUPPORTED);
		}
	}

}
 