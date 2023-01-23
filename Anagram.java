package com.antra;

public class Anagram {
	public static void main(String[] args) {
		String s1 = "silent";
		String s2 = "listen";
		boolean checkAnagram = checkAnagram(s1, s2);
		System.out.println(checkAnagram);
	}

	private static boolean checkAnagram(String s1, String s2) {
		char[] charArray = s1.toCharArray();
		int length = s1.length();
		int count = 0;
		for (int i = 0; i < charArray.length; i++) {
			if (s2.contains(charArray[i] + "")) {
				count++;
			}
		}
		if (count == length) {
			char[] charArray2 = s2.toCharArray();
			int count1 = 0;
			for (int i = 0; i < charArray2.length; i++) {
				if (s1.contains(charArray2[i] + "")) {
					count1++;
				}
			}
			if (count1 == charArray2.length) {
				return true;
			}
		}

		return false;

	}

}
