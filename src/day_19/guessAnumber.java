package day_19;

import java.util.Random;
import java.util.Scanner;

public class guessAnumber {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	Random random = new Random();	
	System.out.println("welcome to guess a numbergame");
		 int secretNumber= random.nextInt();
	int guessNumber ;
	
	do {
		System.out.println("Guess a number");
		
		if(guessNumber< secretNumber) {
			System.out.println("your num is too small");
		}else if(guessNumber> secretNumber) {
				System.out.println("your num is too large");
				guessNumber = scan.nextInt();
			}
		
	}while(guessNumber != secretNumber);
	System.out.println("congrats you won");
	
}
}
