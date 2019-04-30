 package day07_scanner_operators;

public class ComparisonRelationalOperators {
public static void main(String[] args) {
	int speedLimit= 55 ;
	int currentSpeed = 75;
	System.out.println(currentSpeed == speedLimit);
	boolean atLimit=currentSpeed==speedLimit;
	
	System.out.println("At speed limit: "+atLimit);
	boolean overLimit = currentSpeed > speedLimit;
	System.out.println("Over speed limit: "+ overLimit);
	
	boolean underLimit= currentSpeed > speedLimit;
	
	System.out.println("Under limit: "+ underLimit);
	
	double blanace= 150.0;
	double balance;
	boolean broke = balance;
	
	System.out.println("Broke: :" + broke);
	
	double transaction = 155.5 ;
	
	broke= (balance- transaction<0) ;
	System.out.println("willmake borke/negative? - " + broke);
	
	System.out.println("Balance: " + balance);
	
	
	
}
}
