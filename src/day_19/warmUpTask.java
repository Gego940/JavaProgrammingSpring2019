package day_19;

import java.util.Scanner;

public class warmUpTask {
public static void main(String[] args) {
	
	Scanner scan= new Scanner(System.in);
	
	System.out.println("what is your balance?");
	double balance = scan.nextDouble();
	int count = 0 ;
	
	while (balance > 0 ) {
		count++; //increase transaction by 1
		System.out.println("What is your transaction # "+count+ "amount?");
		double transaction = scan.nextDouble();
		// balance = balance - transaction;
		if(transaction > balance) {
			System.out.println("you balance is about to be negative");
		}
		balance -= transaction ;
		System.out.println( "your current balance is "+ balance );
		
		}
	
	System.out.println("you have isufficietnt funds your balance is "+ balance);
	System.out.println("transaction total count "+count);
	
	}
	
	
}

