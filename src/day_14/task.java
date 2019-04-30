package day_14;

import java.util.Scanner;

public class task {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter 2 words");
	String word1 = scan.next();
	String word2 = scan.next();
	
	if(word1.length() > word2.length()) {
		System.out.println(word1+" is longer");
		
	}else if(word2.length() > word1.length()) {
		
		
	}else {
		System.out.println(word1+" and "+word2+" are same length");
	}
	
}
}
