package day1;

import java.util.Scanner;

public class dipaksep5 {
public static void main(String[] args) {
System.out.println("please enter a string");
Scanner in = new Scanner(System.in);
String input = in.nextLine();
char[]chararray = input.toCharArray();
	int count = 0;
	for(char ch: chararray) {
	switch(ch){
	case 'a':
	case 'e':	
	case 'i':	
	case 'o':	
	case 'u':
	case 'A':	
	case 'E':	
	case 'I':	
	case 'O':	
	case 'U':
		count++;
	break;
	default:
		
}
}
System.out.println("number of vowel in string     "+count);	
}}
