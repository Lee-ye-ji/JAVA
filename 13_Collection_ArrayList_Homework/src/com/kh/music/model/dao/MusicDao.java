package com.kh.music.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.kh.music.model.vo.Music;

public class MusicDao {
	
	public ArrayList<Music> fileOpen(){
		ArrayList<Music> list = new ArrayList<>();
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("musictxtList.txt"))){
			list = (ArrayList<Music>)ois.readObject();
		} catch (IOException e) {
			System.out.println("musictxtList.txt 파일을 로드하지 못했습니다.");
		} catch (ClassNotFoundException e) {
			System.out.println("ArrayList<Music>으로 캐스팅 할 수 없습니다.");
		}
		return list;
	}
	
	public void fileSave(ArrayList<Music> list) {
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("musictxtList.txt"))){
			oos.writeObject(list);
		} catch (IOException e) {
			System.out.println("musictxtList.txt 파일 저장에 실패하였습니다.");
		}
	}

}
