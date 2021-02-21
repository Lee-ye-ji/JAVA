package com.kh.music.view;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.kh.music.controller.MusicController;
import com.kh.music.model.comparator.AscTitle;
import com.kh.music.model.comparator.DescArtist;
import com.kh.music.model.comparator.DescTitle;
import com.kh.music.model.vo.Music;

public class MusicMenu {
	// 스캐너 객체 생성
	Scanner sc = new Scanner(System.in);
	// MusicController 객체 생성
	private MusicController mc  = new MusicController();
	
	public MusicMenu() {} 
	
	// 메인메뉴
	public void mainMenu() {
		
		// 프로그램이 시작 될 때 저장되어 있는 뮤직리스트 파일 읽어오기
		mc.loadMusicList();
		
		while(true) {
			System.out.println("******* 메인 메뉴 *******");
			System.out.println("1. 곡 추가");
			System.out.println("2. 곡 전체 조회");
			System.out.println("3. 정렬하여 조회");
			System.out.println("4. 가수명으로 검색");
			System.out.println("5. 곡명으로 검색");
			System.out.println("6. 곡 정보 수정");
			System.out.println("7. 곡 삭제");
			System.out.println("0. 종료");
			System.out.print("메뉴 번호 선택 :");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1: 
				addList(); 
				break;
			case 2: 
				selectList();
				break;
			case 3:
				sortMenu();
				break;
			case 4:
				searchArtist();
				break;
			case 5:
				searchTitle();
				break;
			case 6:
				updateMusic();
				break;
			case 7:
				removeMusic();
				break;
			case 0:
				System.out.println("프로그램 종료");
				// 프로그램이 종료 될 때 뮤직 리스트 파일로 저장
				mc.saveMusicList();
				return;
			default:
				System.out.println("잘못 입력 하셨습니다.");
				break;
			}
		}
		
	}
	
	// 곡 추가
	public void addList() {
		
		System.out.println("-------- 새로운 곡 추가 -------");
		System.out.print("가수를 입력해주세요 :");
		String artist = sc.nextLine();
		System.out.print("곡명을 입력해주세요 :");
		String title = sc.nextLine();
		
		// 입력 받은 artist와 title을 통해 Music 객체 생성 (music)
		Music music = new Music(artist, title);
		mc.addList(music);
		
	}
	
	// 전체 조회
	public void selectList() {
		System.out.println("-------- 전체 곡 목록 조회 --------");
		// MusicController의 selectList() 메소드 호출하여 ArrayList<Music> 전달받음
		ArrayList<Music> list = mc.selectList();
		
		// 전달 받은 list가 비어있지 않을 경우  
		// ->조건식에 list의 isEmpty() 사용	
		if(!list.isEmpty()) {
			for(int i  = 0; i < list.size(); i++) {
				// for문을 이용하여 list 전체 출력  
				// -> 출력문에 list의 get(index) 사용
				System.out.println(list.get(i));
			}
		}else {
			System.out.println("목록이 존재하지 않습니다.");
		}
		
	}
	
	//정렬용 서브메뉴
	public void sortMenu() {
		System.out.println("******* 정렬용 메뉴 *******");
		System.out.println("1. 가수명 별 오름차순 정렬");
		System.out.println("2. 곡명 별 오름차순 정렬");
		System.out.println("3. 가수명 별 내림차순 정렬");
		System.out.println("4. 곡명 별 내림차순 정렬");
		System.out.print("메뉴 번호 선택 : ");
		int menu = sc.nextInt();
		sc.nextLine();
		
		ascDesc(menu);
		//메소드 실행
	}
	
	// 정렬 조회
	public void ascDesc(int menu) {
		System.out.println("--------- 정렬하여 조회 ---------");
		// -> 정렬용 리스트 새로 생성
		ArrayList<Music> sortList = new ArrayList<Music>(); 
		// MusicController의 selectList 메소드를 통해 전체 리스트를 받아와서 sortList에 추가
		// -> list의 addAll() 사용
		sortList.addAll(mc.selectList());
		
		// 조건문을 통해 전달받은 menu 값이
		switch(menu) {
		case 1: 
				Collections.sort(sortList); 
				System.out.println(" 가수명 별 오름차순 정렬"); 
				break;
		case 2: 
				Collections.sort(sortList, new AscTitle()); 
				System.out.println(" 곡명 별 오름차순 정렬"); 
				break; 
		case 3: 
				Collections.sort(sortList, new DescArtist()); 
				System.out.println(" 가수명 별 내림차순 정렬"); 
				break;
		case 4: 
				Collections.sort(sortList, new DescTitle());  
				System.out.println(" 곡명 별 내림차순 정렬"); 
				break;
		}
		// for문을 통해 sortList 출력
		for(int i  = 0; i < sortList.size(); i++) {
			System.out.println(sortList.get(i));
		}
}
	
	// 가수명 검색
	public void searchArtist() {
		System.out.println("-------- 가수명으로 검색 ---------");
		// 검색할 곡의 가수명을 입력하시오 :  >> 입력 받음(artist)
		System.out.print("검색할 곡의 가수명을 입력하시오 : ");
		String artist = sc.nextLine();
		
		// 검색 결과 값 전달 받음 (ArrayList<Music> 객체)
		ArrayList<Music> search = mc.searchArtist(artist);
		// 전달 받은 값이 없으면
		if(search.isEmpty()) {
			System.out.println("검색한 곡이 없습니다.");
		}else {
			// 반환 값이 있으면
			System.out.println(search);
		}
	}
	
	// 곡명 검색
	public void searchTitle() {
		System.out.println("-------- 곡명으로 검색 ---------");
		System.out.print("검색할 곡의 제목을 입력하세요 : ");
		String title = sc.nextLine();
		
		// MusicController의 searchTitle 메소드로 전달
		ArrayList<Music> search = mc.searchTitle(title);
		// 전달 받은 값이 없으면
		if(search.isEmpty()) {
			System.out.println("검색한 곡이 없습니다.");
		}else {
			// 반환 값이 있으면
			System.out.println(search);
		}
	}
	
	// 곡 정보 수정
	public void updateMusic() {
		System.out.println("------- 곡 정보 수정 --------");
		// 수정할 곡의 제목을 입력하시오 : >> 입력 받음(title)
		System.out.print("수정할 곡의 제목을 입력하시오 : ");
		String title = sc.nextLine();
		
		// 수정할 가수명 : >> 입력 받음(updateArtist)
		System.out.print("수정할 가수명 : ");
		String updateArtist = sc.nextLine();
		
		// 수정할 제목명 : >> 입력 받음(updateTitle)
		System.out.print("수정할 제목명 : ");
		String updateTitle = sc.nextLine();
		
		// updateArtist, updateTitle을 가지고 Music객체 생성(updateMusic)
		Music updateMusic = new Music(updateArtist, updateTitle);
		
		// MusicController의 updateMusic 메소드로 title, updateMusic 전달
		// -> 검색 결과 값 전달 받음(result)
		int result = mc.updateMusic(title, updateMusic);
		
		// result가 0보다 크면
		if(result > 0) {
			// >> “성공적으로 수정되었습니다.” 출력
			System.out.println("성공적으로 수정되었습니다.");
		}else {
			// >> “수정할 곡을 찾지 못했습니다.” 출력
			System.out.println("수정할 곡을 찾지 못했습니다.");
		}
	}
	
	// 곡 삭제
	public void removeMusic() {
		System.out.println("------- 곡 삭제 --------");
		// 삭제할 곡의 제목을 입력하시오 : >> 입력 받음(title)
		System.out.print("삭제할 곡의 제목을 입력하시오 : ");
		String title = sc.nextLine();
		
		// MusicController의 removeMusic 메소드로 title 전달
		//  검색 결과 값 전달 받음(result)
		int result = mc.removeMusic(title);
		
		// result가 0보다 크면
		if(result > 0) {
			// >> “성공적으로 수정되었습니다.” 출력
			System.out.println("성공적으로 수정되었습니다.");
		}else {
			// >> “삭제할 곡을 찾지 못했습니다.” 출력
			System.out.println("삭제할 곡을 찾지 못했습니다.");
		}
		
	}

}
