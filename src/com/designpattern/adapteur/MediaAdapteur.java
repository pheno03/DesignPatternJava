package com.designpattern.adapteur;

public class MediaAdapteur implements MediaPlayer, ConstantesValeur{

	AdvancedMediaPlayer advancedMusicPlayer;

	public MediaAdapteur(String audioType) {

		if (audioType.equalsIgnoreCase(TYP_VLC)) {
			advancedMusicPlayer = new VlcPlayer();
		} else if (audioType.equalsIgnoreCase(TYP_MP4)) {
			advancedMusicPlayer = new Mp4PLayer();
		}

	}

	@Override
	public void play(String audioType, String fileName) {
		// TODO Auto-generated method stub

		if (audioType.equalsIgnoreCase(TYP_VLC)) {
			advancedMusicPlayer.playVlc(fileName);
		} else if (audioType.equalsIgnoreCase(TYP_MP4)) {
			advancedMusicPlayer.playMp4(fileName);
		}

	}

}
