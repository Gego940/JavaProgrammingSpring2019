package day23;

import java.util.Scanner;

public class calculateSum {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	String sum ="" ;
	String word = "";
	System.out.println("Please enter 6 Words");
	for(int i = 0 ; i < 6; i++) {
		System.out.println("Enter word");
		word = scan.next();
		if(word.equals("java")) {
			continue;
		}
		sum+=word+".";
	}
	System.out.println("Total sum: "+sum);
	
}
}
