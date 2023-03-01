package com.test;

public class StringBraces {

	public boolean isValid(String str) {

		char[] cs = str.toCharArray();
		for (int i = 0; i < cs.length; i++) {
			if (cs.length % 2 != 0) {
				return false;
			}
			
			if ((cs[i] == '[' && cs[i + 1] != ']') || (cs[i] == '(' && cs[i + 1] != ')')
					|| (cs[i] == '{' && cs[i + 1] != '}')) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String str = "(){}[]";
		StringBraces sb = new StringBraces();
		System.out.println(sb.isValid(str));
	}

}
