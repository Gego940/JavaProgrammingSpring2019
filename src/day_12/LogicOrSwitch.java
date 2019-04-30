package day_12;

public class LogicOrSwitch {

	public static void main(String[] args) {
	    char grade='D';
	    // A, B, C= pass, D,E=fail
	    switch(grade) {
	    case'A':
	    case'B':
	    case 'C':
	    System.out.println("Pass");
	    break;
	    case 'D':
	    case 'E':
	    System.out.println("Fail");
	    break;
	    default:
	    System.out.println("Invalid grade");
	    }
}
}
