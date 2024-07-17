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

public class AppApp {
	
	public void inFile()  {
		InputStream fr = new FileInputStream("C:\\javaStudy\\PhoneDB.txt");
		InputStreamReader isr = new InputStreamReader(fr, "UTF-8");
		BufferedReader br  = new BufferedReader(isr);
	}
	
	public void outFile() {
		OutputStream out = new FileOutputStream("C:\\javaStudy\\PhoneDBv2.txt");
		OutputStreamWriter osw = new OutputStreamWriter(out, "MS949");
		BufferedWriter bw = new BufferedWriter(osw);
	}
	
	
	

}
