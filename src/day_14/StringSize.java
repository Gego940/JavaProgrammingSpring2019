package day_14;

public class StringSize {
public static void main(String[] args) {
	String str1 = "Good Morning";
	
	
	if(str1.contentEquals(("Good Morning"))) {
		System.out.println("Match");
	}else {
		System.out.println("Not Match");
	}
	
	if (str1.equalsIgnoreCase("good morning")) {
		System.out.println("Match-ignore case");
		
	}else {
		System.out.println("Not Match- ignore case");
	}
	
	
	System.out.println(str1.toUpperCase());
	System.out.println(str1);
	str1 = str1.toUpperCase();
	
	if(str1.toLowerCase().contentEquals("good morning")) {
		
	}
	
	
	String userName = "GeorgKelava";
	if(userName.length() == 8) {
		System.out.println("correct!");
	}else {
		System.out.println("try again!");
		
	}
			String password = "123456";
			if(password.length() >= 6) {
				System.out.println("correct");
			}else {
				System.out.println("not correct");
			}
			
			
			
			
}
}
