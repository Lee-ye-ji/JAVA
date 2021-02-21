package com.kh.music.model.vo;

import java.io.Serializable;
import java.util.Comparator;

public class Music implements Comparable<Music>, Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8147257211301257220L;
	private String artist;
	private String title;
	
	public Music() {}

	public Music(String artist, String title) {
		super();
		this.artist = artist;
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Music [artist=" + artist + ", title=" + title + "]";
	}

	@Override
	public int compareTo(Music o) {
		// 가수별 오름차순
		return artist.compareTo(o.getArtist());
	}

	
	

}
