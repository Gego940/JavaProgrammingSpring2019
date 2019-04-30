package day30;

import java.util.Scanner;

public class warmup {
public static void main(String[] args) {
	introduce();
	print5Stars();// call the method
	//call print5Stars 100 times
	for (int i = 1;i<=100;i++) {
		print5Stars();
	}
	for (int i = 1;i<=100;i++) {
		print5Stars();
	}
}

public static void print5Stars() {
	System.out.println("*****");

}
public static void introduce() {
	Scanner scan = new Scanner(System.in);
	System.out.println("Hii,whats is your name?");
	String name = scan.next();
	System.out.println("Nice to meet you,"+name+".");
}

}
