package com.lihaogn.AdapterPattern.impl;

import com.lihaogn.AdapterPattern.AdvancedMediaPlayer;

public class VlcPlayer implements AdvancedMediaPlayer {

	@Override
	public void playVlc(String fileName) {

		System.out.println("playing vlc file. name: "+fileName);
	}

	@Override
	public void playMp4(String fileName) {

	}

}
