package day_12;

import java.util.Scanner;

public class calculatorV01 {
public static void main(String[] args) {
	
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter first number:");
	double num1 = scan.nextDouble();
	System.out.println("Enter second number");
	double num2 = scan.nextDouble();
	System.out.println("Select Operator: +, - ,* ,/ ,%");
	String operator = scan.next();
	double result = 0.0;
	if(operator.equals("+")) {
		result = num1 + num2;
	}else if(operator.contentEquals("-")) {
		result = num1 - num2;
		
	}else if (operator.equals("*")) {
		result = num1 * num2 ;
	}else if(operator.equals("/")) {
		result = num1 / num2 ;
		
	}else if(operator.equals("%")) {
		result = num1 % num2;
		
	}else {
		System.out.println("Invalid operators selected: "+operator);
		return;
	}
	System.out.println("Result: "+result);
}
}
