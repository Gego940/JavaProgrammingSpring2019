package day031;

import java.util.Arrays;

public class methodsWithString {
	public static void main(String[] args) {
		countWords("Java is fun");
		googleSearchResults("About 121,000,000 results (0.77 seconds)");
	}

	public static void countWords(String sentence) {
		String stArr[] = sentence.split(" ");
		System.out.println("words in the sentence" + Arrays.toString(stArr));
		System.out.println("Num of words " + stArr.length);
	}

public static void googleSearchResults(String result) {
	String[]words = result.split(" ");
	String count = words[1].replace(",", "");
			String seconds = words[3].replace("(", "");
			System.out.println("result count: "+ count);
			System.out.println("Time in seconds: "+seconds);
			
}
}
