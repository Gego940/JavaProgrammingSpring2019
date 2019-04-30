package day23;

import java.util.Scanner;

public class Task {
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter number");
	for(int i = 1; i <= 50; i++) {
		if(i%5 == 0) {
			continue;
		}
		if(i%20 == 0) {
			break;
		}
		System.out.print(i + ", ");
	}
}

}
