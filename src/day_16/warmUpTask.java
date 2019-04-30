package day_16;

import java.util.Scanner;

public class warmUpTask {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String domain;
	String extension;
	
	System.out.println("Enter URL");
	String url = scan.next();
	
	if(url.startsWith("www.")) {
		System.out.println("Good");
	}else {
		System.out.println("Incorrect URL");
	}if(url.charAt(url.length()-4)!='.') {
		System.out.println("wrong extension");
	}else {
		System.out.println("good");
	}
	
}
}
