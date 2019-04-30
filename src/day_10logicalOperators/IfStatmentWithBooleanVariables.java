package day_10logicalOperators;

public class IfStatmentWithBooleanVariables {
	public static void main(String[] args) {
		
	boolean isBreakTime = true;
	
	if(isBreakTime == true) {
		System.out.println("Break til 8:35Pm");
		}
 else {
	 System.out.println("Not Break time yet");
	 }
	
	
	boolean classTime = false ;
	if(classTime) {
		System.out.println("Come back on time");
		System.out.println("Stop talking");
	
	}
	
	else {
		System.out.println("take a walk and have some watter");
	}
	
	boolean qualified = false ;
			//send a notification message if not qualified
	
	if(qualified==false) {
		System.out.println("your application wasnt approved");
	}
}

}