package day_16;

public class isEmpty {
public static void main(String[] args) {
	String userName = "";
	String password = "";
	System.out.println(userName.isEmpty());
	if(userName.isEmpty()) {
		System.out.println("Username field cannot be empty");
	}else {
		System.out.println("Username is not empty");
		}
	if(userName.isEmpty()|| password.isEmpty()) {
		System.out.println("Username or password cannot be empty");
	}else {
		System.out.println("Username or password is not empty");
	}
	
	if(userName.length()==0) {
		System.out.println("Username lenght is 0,soits empty");
	}
}
}