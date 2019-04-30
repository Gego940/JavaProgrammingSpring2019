package day_18;

import java.util.Scanner;

public class EnterPinCode {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter Pin Code");
	int pin = 2416;
	int pinCode = scan.nextInt();
	int attempts = 0 ;
	 while(pinCode != pin) {
		 System.out.println("wrong pincode");
		 pinCode= scan.nextInt();
		 attempts++;
		 if(attempts>=2) {
			 System.out.println("too many attempts");
			 return;
			 
		 }
	 }

	System.out.println("correct pin");
	
}
}
