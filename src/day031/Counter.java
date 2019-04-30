package day031;

import java.util.Scanner;

public class Counter {
	public static void main(String[] args) {
		countUp(0);
		countUp(10);
		System.out.println();
		countDown(10);
		countDown(0);
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter num to countUp");
		int inputNum= scan.nextInt();
		countUp(inputNum);
		

	}

	public static void countUp(int num) {
		if (num < 1) {
			System.out.println("Invalid input");
		} else {
			for (int i = 1; i <= num; i++) {
				System.out.print(i + " ");

			}
		}

			
//	1) name: countUp
///return type: void
//param: int
//it prints from 1 to the value of the param
//countUp(5);
//1 2 3 4 5

		}
		public static void countDown(int num) {
			if (num < 1) {
				System.out.println("Invalid input");
			} else {
				for (int n = num; n >= 1 ; n--) {
					System.out.print(n + " ");

				}

				System.out.println();
	}
}
}