package com.designpattern.adapteur;

public class VlcPlayer implements AdvancedMediaPlayer,ConstantesValeur {

	@Override
	public void playVlc(String fileName) {
		System.out.println(FILE_VLC_PLAYING + fileName);

	}

	@Override
	public void playMp4(String fileName) {
		// do nothing

	}

}
