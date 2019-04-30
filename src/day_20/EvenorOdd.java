package day_20;

public class EvenorOdd {
public static void main(String[] args) {
	
	
	for(int even = 1; even <=100; even++) {
		if(even% 2==0) {
			System.out.print(even + " ");
		}
		
	}
	
	for(int odd = 1; odd<=100; odd++) {
		if(odd%2==1) {
			System.out.print(odd+" ");
		}
	}
	System.out.println("");
	int sumOfOdds =0;
			int sumOfEvens = 0;
			for( int num =1 ;num <=100; num++) {
				if(num %2 == 0 ) {
					sumOfEvens += num;
				}else {
					sumOfOdds += num ;
				}
			}
			System.out.println("Sum of evens "+ sumOfEvens);
			System.out.println("Sum of odds "+sumOfOdds);
}
}
