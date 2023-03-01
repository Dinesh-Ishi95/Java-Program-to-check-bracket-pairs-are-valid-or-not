package com.test;

import java.util.Arrays;

public class OccuranceCharactersInString {

	public static void main(String[] args) {

		String statement = "I am a Java Developer";

		char[] cs = statement.replace(" ", "").toLowerCase().toCharArray();

		Arrays.sort(cs);

		for (int i = 0; i < cs.length; i++) {

			int count = 1;

			for (int j = i + 1; j < cs.length; j++) {

				if (cs[i] == cs[j]) {

					count++;
				}
			}

			System.out.println(cs[i] + " : " + count);
			i = i + (count - 1);
		}

	}

}
