package day_022;

public class LookForWordinString {
public static void main(String[] args) {
	String sentence = "He said hi,then she replied hi.hi guys!";
	int count = 0 ;
	for(int i= 0 ; i < sentence.length()-1; i++) {
	String temp = sentence.substring(i,i+2);
	
//	System.out.println(temp);
	if(temp.equals("hi")) {
		count++;
		
	}
	
	}
	System.out.println("count: "+count);
	
	
	
}
}
