package day_15;

public class IndexOf2 {
public static void main(String[] args) {
	String list = "html-selenium-angular-jenkins-grid";
	int firstDash = list.indexOf("-");
	System.out.println("First dash :"+firstDash);
	int secondDash = list.indexOf( "-" , 5);
	System.out.println("second dash:"+ secondDash);
	
}
}
