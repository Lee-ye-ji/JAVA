package src.kh.practice2.controller;

import javax.naming.NamingException;

public class NamingTest {
	public NamingTest() {} //�⺻ ������
	
	public boolean isReservedWord(String user) throws NamingException{
		// ���� ���ڿ��� ������ ������ Ȯ��. 
		String[] reservedWord = {"abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class", "const",
				"continue", "default", "do", "double", "else", "enum", "extends", "false", "final", "finally", "float", "for", "if",
				"goto", "implements", "import", "instanceof", "int", "interface", "long", "native", "new", "null", "package",
				"private", "protected", "public", "return", "short", "static", "strictfp", "super", "switch", "synchronized", "this",
				"throw", "throws", "transient", "true", "try", "void", "volatile", "while"};
		
		for(String s : reservedWord) {
			// ��� ��Ģ�� ��߳��� "���� ��� ��Ģ�� ��߳��ϴ�.(����� ��� �Ұ���)"�̶�� ���ܸ� ����.
			if(s.equals(user)) {
				throw new NamingException("���� ��� ��Ģ�� ��߳��ϴ�.(����� ��� �Ұ���)");
			}else {
				return true;
			}
		}
		return false;
		
	}
	
	public boolean isSpecialWord(String user) throws NamingException {
		// ���� ���ڿ��� ���� ��� ��� ������ ����(Ư������ ����)�� ����ִ��� Ȯ��.
		String[] specialChar = {"!", "@", "#", "%", "^", "&", "*", "-", "+", "|", "?", 
				"/", "<", ">", ";", ":", "{", "}", "[", "]"};  
		// ��� ��Ģ�� ��߳��� "���� ��� ��Ģ�� ��߳��ϴ�.
		for(int i = 0; i < specialChar.length; i++) {
			if(user.contains(specialChar[i])) {
				// (�����ڿ� '_', '$', ���� ��� ����)"�̶�� ���ܸ� ����
				throw new NamingException("���� ��� ��Ģ�� ��߳��ϴ�.(�����ڿ� '_', '$', ���� ��밡��)");
			}else if(user.contains("_") || user.contains("$")) {
				return true;
			}else {
				return true;
			}
		}
		return false;
	}
	
	public boolean isNumFirst(String user) throws NamingException{
		// ���� ���ڿ��� �� �� ���ڰ��������� Ȯ��. 
		if(user.charAt(0) >= '0' && user.charAt(0) <= '9') {
			// ��� ��Ģ�� ��߳��� ������ ��� ��Ģ�� ��߳��ϴ�.(�� �� ���� �Ұ���)�� �̶�� ���ܸ� ����
			throw new NamingException("���� ��� ��Ģ�� ��߳��ϴ�.(�� �� ���� �Ұ���)");
		}else {
			return true;
		}
	}

}
