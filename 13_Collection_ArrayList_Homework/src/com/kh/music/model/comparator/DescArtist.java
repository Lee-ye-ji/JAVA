package com.kh.music.model.comparator;

import java.util.Comparator;

import com.kh.music.model.vo.Music;

public class DescArtist implements Comparator<Music>{

	@Override
	public int compare(Music o1, Music o2) {
		// TODO Auto-generated method stub
		return -1 * (o1.getArtist().compareTo(o2.getArtist()));
	}

}
