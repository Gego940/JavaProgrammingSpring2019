package day_15;

public class Contains {
	public static void main(String[] args) {
		String email = "test@gmail.com";
		
		email.contains("@");
		System.out.println(email.contains("@"));
		
		String list = "potatoes,apples,tomatoes,eggs,milk,bread,cereal,meat";
		
		if(list.contains("apples")) {
			System.out.println("apples are there ");
		}else {
			System.out.println("lets add apples now!");
		}
		
	String name= "Georg" ;
	if(name.contains("a") || name.contains("e")) {
		System.out.println("YES IT DOES");
		
	}else {
		System.out.println("it doesnt contain");
		
	}
	}

}
