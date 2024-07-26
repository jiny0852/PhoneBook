package com.javaex.phonebook;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public abstract class AppApp {
	
	/*
	public void inFile()  {
		InputStream fr = new FileInputStream("C:\\javaStudy\\PhoneDB.txt");
		InputStreamReader isr = new InputStreamReader(fr, "UTF-8");
		BufferedReader br  = new BufferedReader(isr);
	}
	
	public void outFile() {
		OutputStream out = new FileOutputStream("C:\\javaStudy\\PhoneDBv2.txt");
		OutputStreamWriter osw = new OutputStreamWriter(out, "MS949");
		BufferedWriter bw = new BufferedWriter(osw);
	}*/
	
	public ArrayList<Person> readFile(ArrayList<Person> pList, String str) {
		
			//System.out.println("파일 읽기 끝");
			String[] re = str.split(",");
			
			pList.add(new Person(re[0], re[1], re[2]));
			
			return pList;
	}
	
	public void printUser(ArrayList<Person> pList) {
		
		for (int i = 0; i <pList.size(); i++ ) {
			System.out.print( (i+1) );
			pList.get(i).showInfo();
		}
		
	}
	
	public void enterUser() {
		
	}
	
	public void findUserName() {
		
	}
	
	public void updateFile() {
		
	}
	

}
