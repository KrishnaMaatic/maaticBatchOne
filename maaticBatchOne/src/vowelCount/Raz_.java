package day1;

import java.util.Scanner;

public class Raz_ {
	static String str;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		for (int q = 0; q < 5; q++) {
			System.out.println("Enter the vowels letters");
			String str = scan.nextLine();

			int count = 0;
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
						|| ch == 'O' || ch == 'U') {
					count++;
				}
			}
			System.out.println("Number of vowels : " + count);
			

		}

	}

}
