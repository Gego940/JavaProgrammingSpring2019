package day_19;

import java.util.Scanner;

public class Palindrome {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter palendrom word");
	String word = scan.next();
	String reversed="";
	
	int idx = word.length()-1;
	while(idx>= 0) {
	
		reversed = reversed + word.charAt(idx);
		idx--;
	}
	
		System.out.println(word);	
}
}
