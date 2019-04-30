package day09;

public class StringEquals {
public static void main(String[] args) {
	
	String str1= "java";
			String str2 = "java";
			
			System.out.println(str1==str2);   //true
			System.out.println(str1== "java");  //true
			System.out.println(str2=="Java");   //false
			
			//equa;s method. prefered way
			
			System.out.println(str1.equals(str2));
			System.out.println(str1.contentEquals("java")); 
			System.out.println(str2.equals("Java"));
			
			
			String month = new String("March");
			String month2 = new String("March");
			
			System.out.println(month==month2);
			System.out.println(month.equals("March"));
			
			
			
}               

}
