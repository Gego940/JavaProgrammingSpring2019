package day_16;

public class ReplaceThem {
public static void main(String[] args) {
	String sentence = "Coding is fun,its my hobby!!";
	String withNoSpaces = sentence.replace(" ","");
	System.out.println(withNoSpaces);
	
	System.out.println(sentence);
	sentence = sentence.replace("," , "!!!");
	System.out.println(sentence);
	
	String mixed = "^*(*&^ja-va|@#$%^&";
	
	
}
}
