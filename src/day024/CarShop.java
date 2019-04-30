package day024;

public class CarShop {
public static void main(String[] args) {
	String[] cars = {"BMW", "Audi", "Ford", "Honda", "Mercedes", "Mercury", "Rolls-Royce", "Tesla"};
	 for(String c: cars) {
         if(!c.startsWith("M")) {
             continue;
         }
         
         
         if(c.toLowerCase().contains("r")) {
             System.out.println(c);
         }else {
             continue;
         }
System.out.println(c);
 }
	
}
}


