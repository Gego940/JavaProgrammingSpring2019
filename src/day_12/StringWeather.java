package day_12;

import java.util.Scanner;

public class StringWeather {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Hows the weather today");
	String weather = scan.next().toLowerCase();
	
	switch(weather) {
	case "sunny" :
	System.out.println("Go to Park");
	System.out.println("Code Java");
	break ;
	
	case "hot" :
		System.out.println("GoSwimming");
		System.out.println("Code Java");
		break ;
	case "windy":
		System.out.println("Flya kite");
		System.out.println("Code Java");
		break ;
	case "rainy" :
		System.out.println("GoShopping");
		System.out.println("Code java");
		break ;
	case "snow" :
		System.out.println("Change the tires");
		System.out.println("go skiing");
		System.out.println("Code Java");
		break ;
	default:
		System.out.println("code java in any other weather");
	
	}
	System.out.println("###End of Program ###");
	
}
}
