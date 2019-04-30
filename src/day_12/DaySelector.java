package day_12;

import java.util.Scanner;

public class DaySelector {
public static void main(String[] args) {
	
Scanner scan = new Scanner(System.in);
System.out.println("Enter day");
int day = scan.nextInt();
switch(day) {
case 1 :
	System.out.println("Monday");
break;
case 2 :
	System.out.println("Tuseday");
break;
case 3:
	System.out.println("wendsday");
break;
case 4:
	System.out.println("thurseday");
break;
case 5:
	System.out.println("friday");
break;
case 6:
	System.out.println("saturday");
break;
case 7:
	System.out.println("sunday");
break;


}

}
}
