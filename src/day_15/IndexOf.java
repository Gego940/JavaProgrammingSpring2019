package day_15;

public class IndexOf {
public static void main(String[] args) {
	String word1 = "github";
		System.out.println(word1.indexOf("g"));
		System.out.println(word1.indexOf("th"));
		System.out.println("hub");
		System.out.println(word1.indexOf("java"));
		
		String url = "www.okta.com";
		int i = url.indexOf(".");
		
        System.out.println("Pos of . :"+ i);
          System.out.println(url.charAt(i+1));
}
}