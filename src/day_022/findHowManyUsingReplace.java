package day_022;

public class findHowManyUsingReplace {
public static void main(String[] args) {
	String word = "including webpages, images";
	
	int length1 = word.length();
	word = word.replace("e","");
	int length2 = word.length();
	System.out.println("length1: "+length1);
	System.out.println("length2: "+length2);
	
	
	int count = length1 - length2;
	System.out.println("count of e: "+count);
}
}
