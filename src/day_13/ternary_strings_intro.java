package day_13;

import java.util.Scanner;

public class ternary_strings_intro {
public static void main(String[] args) {
	System.out.println("which type of car u are interested in?");
	Scanner scan = new Scanner(System.in);
	int carType = scan.nextInt();
			double averagePrice = 0;
			String carOptions = "";

	
	
	
	switch (carType) {
	case 1: 
		averagePrice= 33000;
        carOptions = "Ford, Dodge, Tesla, Chevrolet, Lincoln" ;
        break ;
	case 2:
		averagePrice= 32000 ;
		carOptions ="Japanese: Toyota, Mitsubisi, Honda, Subaru, Mazda";
		break ;
	case 3: 
		averagePrice =55000;
		carOptions = "German: Bmw, VW, Audi, Mercedes, Porsche" ;
		break ;
	case 4: 
		averagePrice = 85000;
		carOptions = "Italian: Alfa Romeo, Ferrari, Lamborghini, Fiat" ;
		break;
	case 5: 
		averagePrice = 25000 ;
		carOptions = "Korean: Kia, Hyundai, Daewoo";
		break;
			
		default :
			System.out.println("Car type not available");
			break ;		
	}
		 
						
			if(carType>=1 && carType <=5) {
				System.out.println(carOptions);
				System.out.println("Average price: "+averagePrice);
			}
}
}
