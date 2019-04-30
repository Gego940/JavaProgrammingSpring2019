package Day033;

public class PayCalculator {
public static void main(String[] args) {
	System.out.println(getHourlyPay(8,65));
}
public static int getHourlyPay (int hours , int rate) {
	int totalPay= hours * rate ;
	
	if(hours <= 0 ) {
		System.out.println("Invalid hours");
		return 0 ;
	}else if(rate <=0) {
		System.out.println("Invalid rate");
		return 0;
	}else {
		return totalPay ;
	}
}
}
