package com.lihaogn.AdapterPattern;

public class AdapterPatternDemo {

	public static void main(String[] args) {

		AudioPlayer audioPlayer = new AudioPlayer();
		
		audioPlayer.play("mp3", "海阔天空.mp3");
		audioPlayer.play("mp4", "大人物.mp4");
	}

}
