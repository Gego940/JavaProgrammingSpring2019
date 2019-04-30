package Day033;

import day031.calculator;

public class CalcTest {
public static void main(String[] args) {
	System.out.println(warmUpTask.add(3,1));
	System.out.println(warmUpTask.multiply(5, 6));
	System.out.println(warmUpTask.minus(40, 12));
	System.out.println(warmUpTask.divide(100, 2));
	int addResult = warmUpTask.add(21, 41);
	double mResult = warmUpTask.multiply(50,40);
	double dResult = warmUpTask.minus( 3000,200);
	double miResult = warmUpTask.divide(455, 5);
	
	System.out.println(addResult);
    System.out.println(mResult);
    System.out.println(dResult );
    System.out.println(miResult);
    double a = 10.0 ,b = 5.0;
    double myResult = warmUpTask.minus(a, b);
    System.out.println(myResult);
    double[]dNums= {2.0,4.0};
    double result2 = warmUpTask.multiply(dNums[0], dNums[1]);
    System.out.println(result2);
    
    if(warmUpTask.add(10, 16)==26) {
    	System.out.println("Unit test passed.");
    }else {
    	System.out.println("Error");
    }
}
}
