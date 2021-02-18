package src.kh.practice2.controller;

import javax.naming.NamingException;

public class NamingTest {
	public NamingTest() {} //기본 생성자
	
	public boolean isReservedWord(String user) throws NamingException{
		// 받은 문자열이 예약어와 같은지 확인. 
		String[] reservedWord = {"abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class", "const",
				"continue", "default", "do", "double", "else", "enum", "extends", "false", "final", "finally", "float", "for", "if",
				"goto", "implements", "import", "instanceof", "int", "interface", "long", "native", "new", "null", "package",
				"private", "protected", "public", "return", "short", "static", "strictfp", "super", "switch", "synchronized", "this",
				"throw", "throws", "transient", "true", "try", "void", "volatile", "while"};
		
		for(String s : reservedWord) {
			// 명명 규칙에 어긋나면 "변수 명명 규칙에 어긋납니다.(예약어 사용 불가능)"이라는 예외를 띄운다.
			if(s.equals(user)) {
				throw new NamingException("변수 명명 규칙에 어긋납니다.(예약어 사용 불가능)");
			}else {
				return true;
			}
		}
		return false;
		
	}
	
	public boolean isSpecialWord(String user) throws NamingException {
		// 받은 문자열에 변수 명명에 사용 가능한 문자(특수문자 포함)가 들어있는지 확인.
		String[] specialChar = {"!", "@", "#", "%", "^", "&", "*", "-", "+", "|", "?", 
				"/", "<", ">", ";", ":", "{", "}", "[", "]"};  
		// 명명 규칙에 어긋나면 "변수 명명 규칙에 어긋납니다.
		for(int i = 0; i < specialChar.length; i++) {
			if(user.contains(specialChar[i])) {
				// (영문자와 '_', '$', 숫자 사용 가능)"이라는 예외를 띄운다
				throw new NamingException("변수 명명 규칙에 어긋납니다.(영문자와 '_', '$', 숫자 사용가능)");
			}else if(user.contains("_") || user.contains("$")) {
				return true;
			}else {
				return true;
			}
		}
		return false;
	}
	
	public boolean isNumFirst(String user) throws NamingException{
		// 받은 문자열의 맨 앞 글자가숫자인지 확인. 
		if(user.charAt(0) >= '0' && user.charAt(0) <= '9') {
			// 명명 규칙에 어긋나면 “변수 명명 규칙에 어긋납니다.(맨 앞 숫자 불가능)” 이라는 예외를 띄운다
			throw new NamingException("변수 명명 규칙에 어긋납니다.(맨 앞 숫자 불가능)");
		}else {
			return true;
		}
	}

}
