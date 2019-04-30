package day11;

import java.util.Scanner;

public class LogInTests {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter your username");
	String username = scan.next();
	
	
	
	System.out.println("Enter your password");
	String password = scan.next();
	
	String validUsername = "cybertek@gmail.com" ;
	String validPassword = "WoodenSpoon123" ;
	
	if(username.equalsIgnoreCase(validUsername) && password.equals(validPassword)) {
	
	System.out.println("Login Successful, Welcome!");
	}else if(!username.equalsIgnoreCase(validUsername) && !password.equals(validPassword)) {
		System.out.println("Invalid Username and Invalid Password");
	}else if( !username.equalsIgnoreCase(validUsername) && password.equals(validPassword)) {
		System.out.println("Invalid username");
	}else if( username.equalsIgnoreCase(validUsername) && !password.equals(validPassword)) {
		System.out.println("Invalid password");
	
	
	
	
}
}
}