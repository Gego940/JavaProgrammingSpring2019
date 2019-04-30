package day031;

public class Authentication {
public static void main(String[] args) {
	login("mentoring@cybertekschool.com","mentor001");
	login("mentoring@cybertekschool.com","mentor");
	
}
public static void login(String userName,String password) {
	String validUsername = "mentoring@cybertekschool.com";
	String validPassword = "mentor001";
	if(userName.equalsIgnoreCase(validUsername) && password.equals(validPassword)){
		System.out.println("Login Succesfull,Welcome to Okta!");
	}else {
		System.out.println("Sing in failed!");
	}
}
}
