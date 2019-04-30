package day_034;

import java.util.Arrays;

public class VarArgs {
public static void main(String[] args) {
	printWords("red, ","blue ");
	printWords("grey"); //one value
	printWords();// Empty.So array will be empty array.
	String[] myPets={"cat","horse","dog"};
	printWords(myPets);
	System.out.println(sum(3,5,10));
	System.out.println(sum(3,5,10,2456346,345634564,45643,345));
	int budget = 200;
	if (sum(10,45,210,30)<= budget) {
		System.out.println("Within budget");
	}else {
		System.out.println("Broke");
	}
	int total = sum(234,43,567,12,34,5);
	System.out.println("total: "+total);
	cook("Burrito Bowl","Rice","Beans","dOUBLE CHICKEN");
	shoppingList(1000,"Avocado Toast","Watch","Shoes");
	
}
public static void printWords(String... words) {
	//handle it like on ARRAY
	for(String w : words) {
		System.out.println(w);
	}
}//sum (10,30,40); ==> 80
//SUM(30,40);==>70
public static int sum(int...nums) {
	int sum = 0;
	for(int n : nums) {
		sum +=n; //sum = sum + n;
		
	}
	return sum;
	
}
public static void cook(String name,String...ings) {
	System.out.println("Food: "+name);
	System.out.println(Arrays.toString(ings));
}
public static void shoppingList(int totalPrice,String...items) {
	System.out.println("total cost "+totalPrice);
	System.out.println(Arrays.toString(items));
}
}
