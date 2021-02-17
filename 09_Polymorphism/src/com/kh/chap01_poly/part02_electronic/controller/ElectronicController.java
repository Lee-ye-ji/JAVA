package com.kh.chap01_poly.part02_electronic.controller;

import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.Electronic;
import com.kh.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02_electronic.model.vo.Tablet;

// ���� �� ����
public class ElectronicController {
	// 1. ������ ���� ������ �� -> �켱 �԰� �� ��ǰ�� ���� ������ ����
	private Desktop desk = null;
	private NoteBook note = null;
	private Tablet tab = null;	
	
	// �����ε� ����(�Ű������� ��� �ٸ�)
	/*public void insert(Desktop desktop) {
		desk = desktop;
	}

	public void insert(NoteBook noteBook) {
		note = noteBook;
	}

	public void insert(Tablet tablet) {
		tab = tablet;
	}

	// �ش� �ʵ� �� ��ȯ�ô� �����ε� �Ұ� -> �޼ҵ�� ��� �ٸ��� 3�� �ۼ��ؾ���
	public Desktop selectDesktop() {
		// TODO Auto-generated method stub
		return desk;
	}

	public NoteBook selectNoteBook() {
		// TODO Auto-generated method stub
		return note;
	}

	public Tablet selectTablet() {
		// TODO Auto-generated method stub
		return tab;
	}*/
	
	// 2. ������ �������� �� -> ��ü �迭�� ��밡��
	private Electronic[] elec = new Electronic[3];
	private int count = 0; // index ������ ���� 
	
	// �Ű������� �θ� Ÿ������ ����
	public void insert(Electronic any) {
		elec[count++] = any;
	}
	
	// ��ȯ���� �θ�Ÿ������ ����
	public Electronic[] select() {
		return elec;
	}

}
