package Day033;

public class AgeCalculator {
	public static void main(String[] args) {
	System.out.println(calculateAge(1994));	
		
	}
public static int calculateAge(int year) {
 int age = 2019 - year;
 
 if(age >=1 && age <=14) {
	 System.out.println("Child");
	 return age ;
 }else if(age >= 15 && age <=25) {
	 System.out.println("Youngster");
	 return age ;
 }else if( age >= 26 && age <= 64) {
	 System.out.println("Adult");
	 return age ;
 }else if(age>=65) {
	 System.out.println("Senior");
	 return age ;
 }else {
	return 0;
 }
}
}
