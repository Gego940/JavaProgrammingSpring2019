package day_13;

public class more_Ternery {
public static void main(String[] args) {
	
	
	String quality = "bad";
	int rating = (quality.contentEquals("good")) ? 100 : 0;
	
	System.out.println("Rating :"+rating);
	
	int PMHour = 6;
	boolean rushHour = (PMHour >=4 && PMHour <= 7) ? true : false ;
	 String result = rushHour ? "yes" : "no" ;
	System.out.println(PMHour + " is rush hour? "+ result);
	
	
	
	int AMHour = 7; //6 - 9
	// 6 - 9 amRushHour - Yes, No
	String amRushHour = AMHour >= 6 && AMHour <= 9? "Yes" : "No"; 
	
	System.out.println(AMHour + " is rush hour? - " + amRushHour);
}
}
