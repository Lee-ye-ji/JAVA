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
	
	public ScoreProcess() {} //기본 생성자
	
	public void scoreSave() {
		//학생별로 국어, 영어, 수학 성적을 입력하면 
		//총합과 평균을 파일에 저장하는 메소드
		
		int count = 1;
		
			// try with resource 구문으로 “score.txt”파일에 저장되게 
			//DataOutputStream과 FileOutputStream을 생성
			try(DataOutputStream dout = new DataOutputStream(new FileOutputStream("score.txt"))){
				
				while(true) {
					
				System.out.println("======다음의 성적들을 입력하시오======");
				
				System.out.print("국어 : ");
				int kor = sc.nextInt();
				
				System.out.print("수학 : ");
				int math = sc.nextInt();
				
				System.out.print("영어 : ");
				int eng = sc.nextInt();
				sc.nextLine();
				
				// 각 입력 값들을 변수에 저장하고 sum과 avg를 도출해서 파일에 값 저장
				double sum = kor + math + eng;
				double avg = sum / 3;
				
				// Data 보조 스트림을 이용함으로써 write+자료형() 추가
				dout.writeInt(kor);
				dout.writeInt(math);
				dout.writeInt(eng);
				dout.writeDouble(sum);
				dout.writeDouble(avg);
				
				// “x번째 학생 정보 기록”
				System.out.println(count++ +"번째 학생 정보 기록");
				
				while(true) {
					System.out.print("계속 저장하시겠습니까? (y/n) : ");
					String save = sc.nextLine();
					
					if(save.equalsIgnoreCase("y")) {
						// “y”를 입력했다면 다음 학생의 정보를 입력 받고
						break;
					}else if(save.equalsIgnoreCase("n")) {
						// “n”을 입력했다면 “score.txt 파일에 저장 완료”라는 출력 문구가 나옴
						System.out.println("score.txt 파일에 저장 완료");
						return;
					}else {
						// “y”나 “n”이 아닌 값을 입력 받으면 “잘못 입력하셨습니다. 
						// 다시 입력해주세요.”가 나오고 다시 계속 저장하겠냐는 문구가 나옴
						System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
						
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
		// 저장된 성적을 토대로 읽어와서
		// 각 학생별 과목별 점수와 총점 평균을 출력함.
		int count = 1;
		double sumAll = 0;
		double avgAll = 0;
		// try with resource 구문(FileNotFoundException과 EOFException, IOException 처리)
		// 으로 “score.txt”파일에 저장되게 설정하고,
		// EOFException을 활용한 반복문을 통해 파일에 저장된 값을 읽어와서
		try(DataInputStream din = new DataInputStream(new FileInputStream("score.txt"))){
			// EOFException을 활용한 반복문을 통해 파일에 저장된 값을 읽어와서
			while(true) {
				// "국 영 수 총점 평균" 
				int korR = din.readInt();
				int engR = din.readInt();
				int mathR = din.readInt();
				double sumR = din.readDouble();
				double avgR = din.readDouble();
				
				
				// "x번째 학생"
				System.out.println(count++ + "번째 학생");
				
				System.out.println("국어  \t   영어  \t   수학  \t   총점   \t  평균");
				System.out.println(korR + " \t " + engR + " \t " + mathR + "   \t " +
						sumR + " \t" + avgR );
			
				System.out.println();
				
				sumAll += sumR;
				avgAll += avgR;
				
				/*System.out.println(din.readInt() + " " + din.readInt() + " "+ din.readInt() + " " +
						din.readDouble() + " " + din.readDouble());*/
				
			}
			
		} catch (EOFException e) {
			// EOFException이 발생하면,
			// "읽은 횟수 전체 총점 평균 전체 평균"을 출력하고
			System.out.println("읽은 횟수  \t   전체 총점 평균   \t   전체 평균");
			
			// 데이터를 읽은 횟수(몇명의 학생인지), 전체 총점 평균, 전체 평균에 대한 정보가 아래에 출력되게 함
			System.out.printf("%d  \t  %.2f \t  \t%.2f \n", count-1,  sumAll/(count-1),  avgAll/(count -1));
			
			// 그리고 마지막에 “score.txt 파일 읽기 완료!” 문구가 출력됨
			System.out.println("score.txt 파일 읽기 완료!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


}
