package day_20;

public class printEachChar {
public static void main(String[] args) {
	String word = "amazon";
	
	for (int i = 0; i < word.length( ); i++) {
		System.out.println(word.charAt(i));
	}
	
	for (int i = 0; i < word.length( ); i++) {
		
	
	char letter = word.toLowerCase().charAt(i);
		if(letter == 'a' || letter == 'e' || letter== 'o' || letter=='i' || letter == 'u'){
			System.out.println(letter+ ", ");
	}
		
}
}
}