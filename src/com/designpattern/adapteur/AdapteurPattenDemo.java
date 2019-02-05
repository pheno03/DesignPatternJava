package com.designpattern.adapteur;

public class AdapteurPattenDemo implements ConstantesValeur {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AudioPlayer audioPlayer = new AudioPlayer();

		audioPlayer.play(TYP_MP3, FICHIER_MP3);
		audioPlayer.play(TYP_MP4, FICHIER_MP4);
		audioPlayer.play(TYP_VLC, FICHIER_VLC);
		audioPlayer.play(TYP_AVI, FICHIER_VLC);
	}

}
