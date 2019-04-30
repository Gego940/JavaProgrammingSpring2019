package day_022;

public class reverseLoopsubstring {
	public static void main(String[] args) {
		
		
String word = "java";

	for( int n = 3; n>=0 ;n--) {
		String letter= word.substring(n,n+1);
		System.out.println(letter);
}
	
	
	
	int start = 1 ;
	int end = 10 ;
	String word2="UnitedStates";
	System.out.println(word2.substring(start,end));
	System.out.println(word2.substring(2,3));
	System.out.println(word2.substring(6,7));
	System.out.println(word2.substring(word2.length()-1));
	String sentence = "i m learning java proggramin.Java is fun.Love Java!";
	if( sentence.contains("java")) {
		System.out.println(sentence);
	}
	
	
}
}