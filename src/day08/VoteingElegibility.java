package day08;

import java.util.Scanner;

public class VoteingElegibility {
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		int votingAge = 18;
		System.out.println("How old are you?");
		int yourAge = scan.nextInt();
		
		 
		if(yourAge >= votingAge) {
			System.out.println("You are eligible to vote");
			
			System.out.println("You have been eligible to vote for  " + (yourAge- votingAge)+ " years");
			
		} else {
			System.out.println("you are not eligible to vote");
				
			}
		}
			
		
	}


