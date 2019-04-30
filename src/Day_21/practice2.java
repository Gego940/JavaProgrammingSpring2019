package Day_21;

public class practice2 {
public static void main(String[] args) {
	
	String word = "DinamoZagreb";
	String unique ="";
	
	char ch = word.charAt(7);
	System.out.println(unique.contains(""+ch));
	if(!unique.contains(""+ch)) {
		unique += ch;
	}
	System.out.println("unique: "+unique);
	
	
	String word2 = "bananas";
	String unique2 ="";
	
	int i = 0;
	char ch2 = word2.charAt(i);
	System.out.println("Ch2"+ ch2);
	i = 1;
	 ch2 = word2.charAt(i);
	System.out.println("Ch2"+ ch2);
	
	i ++;
	 ch2 = word2.charAt(i);
	System.out.println("Ch2"+ ch2);
	
	
	
	
	
	
	
}
}
