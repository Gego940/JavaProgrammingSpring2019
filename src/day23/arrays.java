package day23;

import java.util.Scanner;

public class arrays {
public static void main(String[] args) {
	int number = new Scanner(System.in).nextInt();
	for (int i = 2; i <number ; i++) {
		if (number%i ==0) {
			System.out.println("this is not a prime number");
			return;
		}
}
	System.out.println("this is a prime number");
}
}
