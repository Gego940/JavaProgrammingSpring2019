package day_12;

public class SwitchScore {
	public static void main(String[] args) {
		
		
		int score = 12 ;
		
		switch(score) {
		case 1:
			System.out.println("Score is 1");
			break;
		case 2:
			System.out.println("Score is 2");
			break;  //exit from switch statment
		case 3: 
			System.out.println("Score is 3");
			break;
			default:
				System.out.println("Invalid score");
			break;	
		}
	}
}
