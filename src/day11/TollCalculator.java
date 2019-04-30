package day11;

import java.util.Scanner;

public class TollCalculator {
public static void main(String[] args) {
	Scanner keybord = new Scanner(System.in);
			
			System.out.println("Enter Vehicle Type:");
	
			int carType = keybord.nextInt();
	System.out.println("Is it rush hour: yes | no");
	
	
	String rushHour = keybord.next();
	boolean isRushHour ;
	if (rushHour.equalsIgnoreCase("yes")) {
		isRushHour = true;
	}else {
		isRushHour = false ;
		System.out.println("true");
	}
	//		double price
}
}
