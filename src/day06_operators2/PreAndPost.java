package day06_operators2;

public class PreAndPost {
	public static void main(String[] args) {
		int num = 0;
		int num2 = num++;
		
		System.out.println("num: "+ num);
		System.out.println("num2: "+ num2);
		
		int n = 0;
		int n2=++n;
		System.out.println("n: "+n);
		System.out.println("n2: "+n2);
		
		
		int bananas = 6;
		int pears = bananas++;
		int apples = ++bananas;
		
		System.out.println(bananas);
		System.out.println(pears);
		System.out.println(apples);
		
		int p1 = 10;
		int sum = p1++ +5;
		System.out.println(sum);
		System.out.println(p1);
		
		
		
	}

}
