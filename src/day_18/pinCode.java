package day_18;

import java.util.Scanner;

public class inCode {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(“Enter Pin Code”);
        int pin = 2416;
        int pinCode = scan.nextInt();
        int attempts = 1;
        while (pinCode != pin) {
            System.out.println(“Wrong pin code”);
            pinCode = scan.nextInt();
            attempts++;
            if (attempts==3 && pinCode != pin) {
                System.out.println(“Too many attempts”);
                return;
        }
        }
        System.out.println(“Correct Pin”);
            
    }
}
