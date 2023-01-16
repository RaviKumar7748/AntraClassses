package _16_01;

import java.util.Scanner;
// antra

public class RotateAStringChar {
	Scanner sc = new Scanner(System.in);

	public String rotateAStringChar(String s) {

		System.out.println("Enter the index number you want to rotate");
		int index = sc.nextInt();
		String reverse = "";

		int i;
		for (i = index; i < s.length(); i++) {
			reverse = reverse + s.charAt(i);

		}
		for (int j = 0; j < index; j++) {
			reverse = reverse + s.charAt(j);
		}
		return reverse;

	}

	public static void main(String[] args) {
		RotateAStringChar obj = new RotateAStringChar();
		String rotateAStringChar = obj.rotateAStringChar("antra");
		System.out.println(rotateAStringChar);

	}

}
