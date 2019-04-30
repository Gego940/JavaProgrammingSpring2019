package day_18;

public class StarCase {
public static void main(String[] args) {
	String stairs = "*";
	
	int  num =  1;
	while(num <=10) {
		System.out.println(stairs);
		stairs+="*";
		num++;
	}
	System.out.println();
	
	
	stairs = "*";
	while(stairs.length()<=10) {
		System.out.println(stairs);
		stairs +="*";
	}
}
}
