package day_022;

import java.util.Scanner;

public class preactice {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int month ;
	
	do {System.out.println("Enter month:");
	
	
	month = scan.nextInt();
	}while(month >= 1 && month<= 12 );
	
	System.out.println("Invalid Month - "+month);
	
	
	String word1 = "Java";
	
	
 word1 = word1.charAt(0)+""+word1.charAt(1);
	System.out.println(word1);
		word1	
}
}
