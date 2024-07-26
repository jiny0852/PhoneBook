package com.javaex.phonebook;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class PhoneApp {

	public static void main(String[] args) throws IOException {//, IndexOutOfBoundsException {
		
		//읽기 스트림
		InputStream fr = new FileInputStream("C:\\javaStudy\\PhoneDB.txt");
		InputStreamReader isr = new InputStreamReader(fr, "UTF-8");
		BufferedReader br  = new BufferedReader(isr);
		
		//쓰기 스트림
		OutputStream out = new FileOutputStream("C:\\javaStudy\\PhoneDBv2.txt");
		OutputStreamWriter osw = new OutputStreamWriter(out, "MS949");
		BufferedWriter bw = new BufferedWriter(osw);
		
		Scanner sc = new Scanner(System.in);
		
		//리스트 업데이트
		//List<Person> pList = new ArrayList<Person>();
		
		List<Person> pList = new ArrayList<Person>();
		
		while (true) {
			
			String str = br.readLine(); 
		
			if (str == null) {
				//System.out.println("파일 읽기 끝");
				break;
			}
		
			String[] re = str.split(",");
		
			pList.add(new Person(re[0], re[1], re[2]));
		
		}
		
		System.out.println("============================");
		System.out.println("=======주소록 관리 프로그램=======");
		System.out.println("============================");
		
		boolean processOn = true;
		
		while (processOn) {
			
			System.out.println("1. 리스트 2. 등록 3. 삭제 4. 검색 5.종료");
			System.out.println("---------------------------------------");
			System.out.print("> 메뉴번호 : ");
			int processNum = sc.nextInt();
			
			switch (processNum) {
			
			
				case 1: //데이터 출력
					
					System.out.println("<1. 리스트>");
					
					
					
					for (int i = 0; i <pList.size(); i++ ) {
						System.out.print( (i+1) );
						pList.get(i).showInfo();
					}
					
					
					/*
					for (Person info : pList) {
						info.showInfo();
					}
					*/
					break;
				
			
				case 2: //데이터 입력
					
					sc.nextLine();
					System.out.println("<2. 등록>");
					
					//String[] re = new String[3];
					System.out.println("정보를 입력하세요");
					
					try {
						
						String enterStr = sc.nextLine();
						String[] re = enterStr.split(",");
						pList.add(new Person(re[0], re[1], re[2]));
						
						
						
						
					} catch (ArrayIndexOutOfBoundsException e) {
						System.out.println(e);
					}
					
					
					
					/*
					System.out.print(">> 이름 : ");
					re[0] = sc.nextLine();
					System.out.print(">> 전화 : ");
					re[1] = sc.nextLine();
					System.out.print(">> 회사 : ");
					re[2] = sc.nextLine();
						*/
					//String[] re = enterStr.split(",");
					
					
										
					
					break;
				
				
				case 3: //데이터 삭제
					
					System.out.println("<3. 삭제>");
					
					System.out.println("정보를 입력하세요");
					System.out.print(">> 번호 : ");
					int delNum = sc.nextInt();
					
					pList.remove(delNum-1);
					System.out.println("[" + delNum +"번 삭제되었습니다]");
					
					break;
					
					
				case 4: //데이터 검색
					
					sc.nextLine();
					System.out.println("<4. 검색>");
					System.out.print(">이름: ");
					String name = sc.nextLine();
					
					for (int i = 0; i < pList.size(); i++) {
						
						if ( ((pList.get(i)).getName()).contains(name)  ) {
							pList.get(i).showInfo();
						}
					}
					
					break;
					
				case 5: //프로그램 종료
					
					System.out.println("주소록을 업데이트합니다");
					for (Person p : pList) {
						bw.write(p.getName() + "," + p.getHp() + "," + p.getCompany());
						bw.newLine();
					}
					
					
					System.out.println("5. 프로그램을 종료합니다");
					processOn = false;
					break;
				
				default:
					System.out.println("잘못된 입력입니다");
					break;
		
			}
			
			
		}
		
		System.out.println("============================");
		System.out.println("=========프로그램  종료=========");
		System.out.println("============================");
		
		
		
		sc.close();
		bw.close();
		br.close();
		System.out.println("프로그램 종료");
	}

	

}
