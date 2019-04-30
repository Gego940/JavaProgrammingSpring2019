package day_15;

import java.util.Scanner;

public class day15 {
public static void main(String[] args) {
	String emoji = ":)" ;
	Scanner scan = new Scanner(System.in);
		
	System.out.println("Enter emoji: ");
	 emoji = scan.next();
	
	if(emoji.length() != 2) {
		System.out.println("Invalid emoji");
		return ; 
	}char first = emoji.charAt(0);
	char second = emoji.charAt(1);
	if (first == ':') {	
		if (second == ')') {
			System.out.println("smile emoji");
		}else if( second == '(') {
			System.out.println("sad emoji");
		}else if (second == '/') {
			System.out.println("upset emoji");
		}else if( second == 'p') {
			System.out.println("playfull emoji");
		}else {
			System.out.println("INVALID EMOJI");
		}
	}else if(first == ';') {
		if(second== ')') {
			System.out.println("wink emoji");
		}else if(second == '0') {
			System.out.println("suprised");
		}else if ()
	}else if( first == '(') {
		
	}else if( first == ')') {
		
	}else {
		System.out.println("Invalid emoji");
	}
	
}
}
