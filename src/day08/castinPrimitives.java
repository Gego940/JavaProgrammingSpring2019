package day08;

public class castinPrimitives {
	
	public static void main(String[] args ) {
		
		//double to whole number
		int i = (int)3.4 ;
		System.out.println("i: "+i);
		
		double price = 230.50;
		int dollars = (int)price;
		
		System.out.println("Price: "+ price);
		System.out.println("Dollars: "+dollars);
		
		//whole numbers. byte ,short , int
		
		int count = 44;
		byte byteCount =(byte)count ;
		
		
		System.out.println(byteCount);
		
		
		long longValue = 345645L;
		int intValue = (int)longValue;
		System.out.println(intValue);
		
		int large = 5678;
		short small = (short) large ;
		System.out.println("small :"+ small);
		
		int result = (int)(500.4 /2.0) ;
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
