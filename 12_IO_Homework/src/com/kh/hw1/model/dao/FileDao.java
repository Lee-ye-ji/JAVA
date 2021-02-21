package com.kh.hw1.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileDao {
	
	 // �Է��� ���� Scanner
	Scanner sc = new Scanner(System.in);
	
	public FileDao() {} // �⺻ ������
	
	//� ���Ͽ� � ������ �������� �Է� �޾� ���� ����� �����ϴ� �޼ҵ�
	public void fileSave() {
		
		// StringBuilder - StringBuffer�� ����� ���� Ŭ����
		// StringBuilder�� ���� ������ ȯ�濡�� �ַ� �߻�(����ȭ ó���� �ϸ� �ӵ��� ���ϵǱ� ����)
		// StringBuffer�� ��Ƽ ������ ȯ�� -> ����ȭ ó���� �Ǿ�� ������
		StringBuilder sb = new StringBuilder();
		
		BufferedWriter bw = null;
		
		// �����Ͽ� ������ ������ �ݺ��ؼ� �Է��Ͻÿ�("exit"�� �Է��ϸ� ���� �Է� ��) :��
		// ���� Scanner�� �Է� �޾� StringBuilder�� �����ϰ�, ��exit���� �Է� ������ ���������� while�� ����
		System.out.print("���Ͽ� ������ ������ �ݺ��ؼ� �Է��Ͻÿ�(\"exit\"�� �Է��ϸ� ���� �Է� ��) :");
		while(true) {
			String note = sc.nextLine();
			
			//�� ���� StringBuilder�� �ֱ� ���� exit���� �ƴ��� �Ǵ��ϴ� ������ �ʿ��ϰ���?
			if(note.equals("exit")) {
				break;
			}else {
				sb.append(note + "\n");
			}
		}
		
		// �������Ͻðڽ��ϱ�? (y/n)��
		System.out.print("�����Ͻðڽ��ϱ�? (y/n) : ");
		char save = sc.nextLine().toUpperCase().charAt(0);
					
		// �Է� ���� ���� �빮���̵� �ҹ����̵� ������� ��y���̸�,
		// ������ ���ϸ��� �Է� ����
		if(save == 'Y') {
			try{
				// ���Է¹��� ���ϸ�.txt���� ����ǰ�
				// BufferedWriter�� FileWriter ��Ʈ�� ���
				System.out.print("������ ���� ���� �Է��Ͻÿ� : ");
				String fileName = sc.nextLine();
							
				// ���Է¹��� ���ϸ�.txt���� ����ǰ�
				// BufferedWriter�� FileWriter ��Ʈ�� ���
				FileWriter fw = new FileWriter(fileName +".txt");
				bw = new BufferedWriter(fw);
				bw.write(sb.toString()); // write() ���ۿ� �״´�
				bw.flush(); // flush() ��������
				// ���Է¹��� ���ϸ�.txt ���Ͽ� ���������� �����Ͽ����ϴ�.��
				System.out.println( fileName + ".txt ���Ͽ� ���������� �����Ͽ����ϴ�.");
				} catch (IOException e) {
					e.printStackTrace();
				}finally {
					// ������ ��Ʈ�� close
					try {
						bw.close(); 
						// finally�ȿ� �ֱ⿡ bw�� �νĵ��� �ʾ� while�� �ۿ� BufferedWriter bw = null;�� ��������
						} catch (IOException e) {
							e.printStackTrace();
						}
				}
		}else {
			// �Է� ���� ���� y�� �ƴ� � ���̵� ���ٽ� �޴��� ���ư��ϴ�.�� ���
			System.out.println("�ٽ� �޴��� ���ư��ϴ�.");
		}
	}
	
	//���ϴ� ������ ���� �Է� �� �ܼ� ȭ�鿡 ����ϴ� �޼ҵ�
	public void fileOpen() {
		BufferedReader br = null;
		// ������ �� ���ϸ� : "
		System.out.print("���� �� ���ϸ� : ");
		// ���ϸ��� Scanner�� �Է� �޾�, BufferedReader�� FileReader ��Ʈ�� ���
		String open = sc.nextLine();
		try{
			br = new BufferedReader(new FileReader( open + ".txt"));
			// try���� �ȿ��� readLine()�޼ҵ带 ���� ���پ� �ַܼ� �Է¹��� �� ���
			String value = "";
			// read()�� ��ȯ ���� int�� �� �о�� ���� ������ -1��ȯ
			// readLine()�� ��ȯ ���� String�̹Ƿ� �о�� ���� ������ null ��ȯ
			while((value = br.readLine()) != null) {
				System.out.println(value);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			// ������ ��Ʈ�� close
			try {
				br.close(); 
				// BufferedReader br = null;�� ������ ���ֱ�
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	// ���� ������ ������� ���� ������ �߰��� �����ϴ� �޼ҵ�
	public void fileEdit() {
		StringBuilder sb = new StringBuilder();
		
		// ������ �� ���ϸ� : "
		System.out.print("���� �� ���ϸ� : ");
		String edit = sc.nextLine();
		
		// ���ϸ��� �Է¹޾� BufferedReader�� BufferedWriter, FileReader�� FileWriter
		BufferedReader br = null;
		BufferedWriter bw = null;
		FileReader fr = null;
		FileWriter fw = null;
		
			try {
				br = new BufferedReader(new FileReader( edit + ".txt"));
				// �ݺ����� ���� �ش� ������ ������ readLine()�޼ҵ带 ���� �ֿܼ� ���
				String value = "";
				while((value = br.readLine()) != null) {
					System.out.println(value);
				}
				// �����Ͽ� �߰��� ������ �Է��Ͻÿ� : ��
				System.out.print("���Ͽ� �߰��� ������ �Է��Ͻÿ� (\"exit\"�Է� ������):");
				while(true) {
					String editContent = sc.nextLine();
					// ����ڰ� ��exit���� �Է��ϱ� ������ ������ StringBuilder
					if(editContent.equals("exit")) {
						break;
					}else {
						sb.append(editContent + "\n");
					}
				}
					// ������� ������ ���Ͽ� �߰��Ͻðڽ��ϱ�? (y/n)��
					System.out.print("����� ������ ���Ͽ� �߰��Ͻðڽ��ϱ�? (y/n) : ");
					String addFile = sc.nextLine();
					
					// �Է� ���� ���� �빮���̵� �ҹ����̵� ������� ��y���̸�,
					if(addFile.equalsIgnoreCase("y")) {
						fw = new FileWriter(edit +".txt", true);
						bw = new BufferedWriter(fw);
						bw.write(sb.toString());
						bw.flush();
						System.out.println(edit + ".txt ������ ������ ����Ǿ����ϴ�.");
					}
			}catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}finally {
				// ������ ��Ʈ�� close
				try {
					br.close(); 
					// BufferedReader br = null;�� ������ ���ֱ�
				} catch (IOException e) {
					e.printStackTrace();
				}
			}	
		

		
	}
	

}
