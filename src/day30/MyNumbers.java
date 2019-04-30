package day30;

import java.util.Random;
import java.util.Scanner;

public class MyNumbers {
public static void main(String[] args) {
	rangePrint();
	//showMe5Numbers();
}

public static void showMe5Numbers() {
	
	Random r = new Random();
	for(int i = 1; i <= 5;i++) {
//		System.out.print(r.nextInt(1001)+" ");
	}
	
	doPush10Ups();
	}
public static void doPush10Ups(){
	
	for(int i = 1;i<= 10;i++) {
		System.out.println("pushup - "+ i);
	}System.out.println("Time to rest");
	
	
}
public static void rangePrint() {
	Scanner scan = new Scanner(System.in);
	System.out.println("Please enter 2 numbers");
	int i = scan.nextInt();
	int b = scan.nextInt();
	if(i < b) {
		for(int j = i; j<=b;j++) {
			System.out.println(j + " ");
		} 
	}else if(i > b) {
		for(int k = i; k>=b;k--) {
			System.out.println(k+" ");
		}
			
		
	}else{
		System.out.println(i);
	}
	
	
		
	
		
}
}