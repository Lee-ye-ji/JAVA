package com.kh.music.controller;

import java.util.ArrayList;

import com.kh.music.model.dao.MusicDao;
import com.kh.music.model.vo.Music;

public class MusicController {
	
	// ArrayList<Music> 객체 생성
	private ArrayList<Music> list = new ArrayList<>();
	private MusicDao md = new MusicDao();
	
	public MusicController() {}
	
	public void addList(Music music) {
		// 전달받은 music을 list에 추가한다. 
		// -> list의 add() 사용
		list.add(music);
	}
	
	public ArrayList<Music> selectList(){
		// list 레퍼런스를 리턴한다.
		return list;
		
	}
	
	public ArrayList<Music> searchArtist(String artist){
		ArrayList<Music> search = new ArrayList<Music>();
		// -> 검색 결과를 담을 ArrayList<Music> 객체 초기화 해놓음
		
		// list 목록 중 전달받은 artist과 일치하는 게 존재할 경우 
		// -> for문 이용
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getArtist().equals(artist)){
				/*// search에 대입하고
				search = list.get(i);
				// -> list의 add() 이용
				list.add(search);*/
				search.add(list.get(i));
				}
		}
		// search 리턴
		return search;
	}
	
	//searchTitle()도 serahcArtist()와 동일한 구조로 구현할 것
	public ArrayList<Music> searchTitle(String title){
		ArrayList<Music> search = new ArrayList<Music>();

		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getTitle().equals(title)){
				search.add(list.get(i));
				}
		}
		return search;
	}
	
	public int updateMusic(String title, Music updateMusic) {
		Music old = null;
		//-> 수정할 객체를 담을 Music 객체 초기화 해놓음

		// list 목록 중 전달받은 title과 일치하는게 존재할 경우 -> for문 이용
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				// old에 대입하고 해당 객체를 전달받은 updateMusic으로 수정 
				old = list.get(i);
				// -> list의 set() 이용
				list.set(i, updateMusic);
			}
		}
		int result = 0;
		if(old != null) {
			// old가 존재할 경우  -> result 값 1 대입
			result = 1;
		}
		// result 리턴한다.
		return result;
		
	}
	
	public int removeMusic(String title) {
		Music old = null;
		 //-> 삭제할 객체를 담을 Music 객체 초기화 해놓음
		 
		// list 목록 중 전달받은 title과 일치하는게 존재할 경우 -> for문 이용
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				// old에 대입하고 해당 객체 삭제
				old = list.get(i);
				// -> list의 remove() 이용
				list.remove(old);
			}
		}
		int result = 0;
		if(old != null) {
			// old가 존재할 경우  -> result 값 1 대입
			result = 1;
		}
		// result 리턴한다.
		return result;
		
	}

	public void loadMusicList() {
		list = md.fileOpen();
	}

	public void saveMusicList() {
		md.fileSave(list);
	}


}
