package day08;

import java.util.Scanner;

public class IfElseWithScanner {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int passingPercentage = 65;
		int yourScorePercentage = scan.nextInt();
		
		
		if(passingPercentage<=yourScorePercentage) {
			
			System.out.println("you passed");
			

		} else {
			System.out.println("you failed");
		}
		
	}

}
