package day06_operators2;

import java.util.Scanner;

public class ScannerYourName {
	public static void main(String [] args) {
		
		//create a scanner object
		Scanner scan = new Scanner(System.in);
		System.out.println("Hi, what is your name?");
		String name= scan.nextLine();  //accept String input
		System.out.println("Nice to meet you. " +name);
	}

}
