package day23;

public class CheckNumber {
public static void main(String[] args) {
	for(int i = 1; i<=20;i++) {
		if(i<=10 && i>=5) {
			continue;
		}
		System.out.println("Number "+ i);
	}
}
}
