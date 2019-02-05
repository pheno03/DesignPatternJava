package com.designpattern.adapteur;

public class Mp4PLayer implements AdvancedMediaPlayer, ConstantesValeur {

	@Override
	public void playVlc(String fileName) {
		// do nothing

	}

	@Override
	public void playMp4(String fileName) {
		System.out.println(FILE_MP4_PLAYING + fileName);

	}

}
