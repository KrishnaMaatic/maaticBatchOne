package vowelCount;

import java.util.Scanner;

public class NabinVowel {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.println("enter your text");
		String tx=scan.nextLine();
		int count=0;
		for(int i=0;i<=tx.length()-1;i++){
			
			char ch=tx.charAt(i);
			if (ch=='a'){count=count+1;}
			if (ch=='e'){count=count+1;}
			if (ch=='i'){count=count+1;}
			if (ch=='o'){count=count+1;}
			if (ch=='u'){count=count+1;}
		}
		System.out.println("total no of vowels:"+count);
	}
	

}
