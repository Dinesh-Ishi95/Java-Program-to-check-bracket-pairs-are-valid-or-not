package com.test;

public class StringBraces {

	public boolean isValid(String str) {
		char[] ch = str.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == '(' && ch[j] == ')' && ch.length % 2 == 0) {
					return true;
				} else if (ch[i] == '{' && ch[j] == '}' && ch.length % 2 == 0) {
					return true;
				} else if (ch[i] == '[' && ch[j] == ']' && ch.length % 2 == 0) {
					return true;
				}
				
			}

		}
		return false;

//		if (str.contains("()") || str.contains("{}") || str.contains("[]")) {
//			return true;
//		} else if (str.contains("(}") || str.contains("(]") || str.contains("[)") || str.contains("[}")
//				|| str.contains("{)") || str.contains("{]")) {
//			return false;
//		}

	}

	public static void main(String[] args) {
		String b = "(]";
		StringBraces sb = new StringBraces();
		System.out.println(sb.isValid(b));
	}

}
