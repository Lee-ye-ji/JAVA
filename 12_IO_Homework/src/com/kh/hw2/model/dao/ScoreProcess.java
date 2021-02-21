package com.kh.hw2.model.dao;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ScoreProcess {
	Scanner sc = new Scanner(System.in);
	
	public ScoreProcess() {} //�⺻ ������
	
	public void scoreSave() {
		//�л����� ����, ����, ���� ������ �Է��ϸ� 
		//���հ� ����� ���Ͽ� �����ϴ� �޼ҵ�
		
		int count = 1;
		
			// try with resource �������� ��score.txt�����Ͽ� ����ǰ� 
			//DataOutputStream�� FileOutputStream�� ����
			try(DataOutputStream dout = new DataOutputStream(new FileOutputStream("score.txt"))){
				
				while(true) {
					
				System.out.println("======������ �������� �Է��Ͻÿ�======");
				
				System.out.print("���� : ");
				int kor = sc.nextInt();
				
				System.out.print("���� : ");
				int math = sc.nextInt();
				
				System.out.print("���� : ");
				int eng = sc.nextInt();
				sc.nextLine();
				
				// �� �Է� ������ ������ �����ϰ� sum�� avg�� �����ؼ� ���Ͽ� �� ����
				double sum = kor + math + eng;
				double avg = sum / 3;
				
				// Data ���� ��Ʈ���� �̿������ν� write+�ڷ���() �߰�
				dout.writeInt(kor);
				dout.writeInt(math);
				dout.writeInt(eng);
				dout.writeDouble(sum);
				dout.writeDouble(avg);
				
				// ��x��° �л� ���� ��ϡ�
				System.out.println(count++ +"��° �л� ���� ���");
				
				while(true) {
					System.out.print("��� �����Ͻðڽ��ϱ�? (y/n) : ");
					String save = sc.nextLine();
					
					if(save.equalsIgnoreCase("y")) {
						// ��y���� �Է��ߴٸ� ���� �л��� ������ �Է� �ް�
						break;
					}else if(save.equalsIgnoreCase("n")) {
						// ��n���� �Է��ߴٸ� ��score.txt ���Ͽ� ���� �Ϸᡱ��� ��� ������ ����
						System.out.println("score.txt ���Ͽ� ���� �Ϸ�");
						return;
					}else {
						// ��y���� ��n���� �ƴ� ���� �Է� ������ ���߸� �Է��ϼ̽��ϴ�. 
						// �ٽ� �Է����ּ���.���� ������ �ٽ� ��� �����ϰڳĴ� ������ ����
						System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");
						
					}
				}
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	
	public void scoreRead() {
		// ����� ������ ���� �о�ͼ�
		// �� �л��� ���� ������ ���� ����� �����.
		int count = 1;
		double sumAll = 0;
		double avgAll = 0;
		// try with resource ����(FileNotFoundException�� EOFException, IOException ó��)
		// ���� ��score.txt�����Ͽ� ����ǰ� �����ϰ�,
		// EOFException�� Ȱ���� �ݺ����� ���� ���Ͽ� ����� ���� �о�ͼ�
		try(DataInputStream din = new DataInputStream(new FileInputStream("score.txt"))){
			// EOFException�� Ȱ���� �ݺ����� ���� ���Ͽ� ����� ���� �о�ͼ�
			while(true) {
				// "�� �� �� ���� ���" 
				int korR = din.readInt();
				int engR = din.readInt();
				int mathR = din.readInt();
				double sumR = din.readDouble();
				double avgR = din.readDouble();
				
				
				// "x��° �л�"
				System.out.println(count++ + "��° �л�");
				
				System.out.println("����  \t   ����  \t   ����  \t   ����   \t  ���");
				System.out.println(korR + " \t " + engR + " \t " + mathR + "   \t " +
						sumR + " \t" + avgR );
			
				System.out.println();
				
				sumAll += sumR;
				avgAll += avgR;
				
				/*System.out.println(din.readInt() + " " + din.readInt() + " "+ din.readInt() + " " +
						din.readDouble() + " " + din.readDouble());*/
				
			}
			
		} catch (EOFException e) {
			// EOFException�� �߻��ϸ�,
			// "���� Ƚ�� ��ü ���� ��� ��ü ���"�� ����ϰ�
			System.out.println("���� Ƚ��  \t   ��ü ���� ���   \t   ��ü ���");
			
			// �����͸� ���� Ƚ��(����� �л�����), ��ü ���� ���, ��ü ��տ� ���� ������ �Ʒ��� ��µǰ� ��
			System.out.printf("%d  \t  %.2f \t  \t%.2f \n", count-1,  sumAll/(count-1),  avgAll/(count -1));
			
			// �׸��� �������� ��score.txt ���� �б� �Ϸ�!�� ������ ��µ�
			System.out.println("score.txt ���� �б� �Ϸ�!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


}
