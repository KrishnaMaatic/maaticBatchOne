package day1;

import java.util.Scanner;

public class Bhawani {
	public static void main(String[] args) {

	int vowel=0;
	char ch;
	
	System.out.println("Enter String:");
	Scanner input=new Scanner(System.in);
	String bha=input.nextLine();
	
	for(int i=0;i<bha.length();i++) {
		
		ch=bha.charAt(i);
		
		if( ch == 'a' || ch == 'A' ||  ch == 'e' || ch == 'E' || ch=='i' || ch=='I' || ch=='o' || ch == 'O' || ch == 'u' || ch == 'U' ) {
				vowel++;
		}
				
		
	}
	System.out.println("Vowels is:" + vowel);
	}
}
	
	
	
	
	
	
	
	

