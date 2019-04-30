package day031;

import java.util.Scanner;

public class calculator {
public static void main(String[] args) {
	add(60,10);
	substract(60,10);
	multiply(10,6);
	divide(60,10);
	reminder(60,10);
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter 2 numbers");
	double n1 = scan.nextDouble();
	double n2 = scan.nextDouble();
	System.out.println("Select operation: + , - , * , / , % .");
	String operator = scan.next();
	switch (operator) {
	case "+" :
		add(n1,n2);
		break;
	case "-" :
		substract(n1,n2);
		break;
	case "*" :
		multiply(n1,n2);
		break;
	case "/" :
		divide(n1,n2);
		break;
	case"%":
		reminder(n1,n2);
		break;
	}
		
}
public static void add(double num1,double num2) {
	double result = num1 + num2;
	System.out.println("Result: " +result);
}
public static void substract(double num1,double num2) {
	double result = num1 - num2;
	System.out.println("Result: " +result);
}
public static void multiply(double num1,double num2) {
	double result = num1*num2;
	System.out.println("Result: " +result);
}
public static void divide(double num1,double num2) {
	double result = num1/num2;
	System.out.println("Result: " +result);
}
public static void reminder(double num1,double num2) {
	double result = num1%num2;
	System.out.println("Result: " +result);
}
}