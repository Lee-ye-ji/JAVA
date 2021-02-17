package com.kh.hw1.controller;

import java.util.StringTokenizer;

public class TokenController {
	
	public String afterToken(String str) {
		
		StringTokenizer stn = new StringTokenizer(str);
		String strBlank = "";
		
		while(stn.hasMoreTokens()) {
			strBlank += stn.nextToken();
		}
		
		return strBlank;
	
	}
	public String firstCap(String input) {
		
		char oldChar = input.charAt(0);
		
		String upper = input.toUpperCase();
		char newChar = upper.charAt(0);
		
		String reStr = input.replace(oldChar, newChar);
		
		return reStr;
		
	}
	public int findChar(String input, char one) {
		
		int count = 0;
		
		char[] arrUpper = input.toUpperCase().toCharArray();
		char[] arrLower = input.toLowerCase().toCharArray();
		
		for(int i = 0; i < input.length(); i++) {
			if(arrUpper[i] == one || arrLower[i] == one) {
				count++;
			}
		}
		
		return count;
		
	}

}
