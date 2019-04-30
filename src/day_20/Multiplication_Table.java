package day_20;

import java.util.Scanner;

public class Multiplication_Table {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	
	
	System.out.println("Enter number:");
	int num =scan.nextInt();
	if(num < 1 || num > 10 ) {
		System.out.println("invalid input");
		return;
	}
	
	
	
	for(int i = 1 ; i<=10 ; i++) {
		System.out.println(num +" x "+ i+" = "+(num*i));
	}
}
}
