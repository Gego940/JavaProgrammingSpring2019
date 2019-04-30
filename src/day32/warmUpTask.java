package day32;

public class warmUpTask {
	public static void main(String[] args) {
		makePancakes();
		 makePasta();
		 cook("Omelette", "Eggs, Salt, Tomatoes, Green Peppers, Onions");
	}
	public static void cook(String dish,String ingredients) {
		System.out.println("---"+dish.toUpperCase()+ " RECIPE---");
		add(ingredients);
		System.out.println("Cook it untill its done");
		System.out.println("---"+dish.toUpperCase()+" IS READY!---");
	}
	public static void makePasta() {
		System.out.println("ITALIAN PASTA RECEPI");
		add("Water, Salt, Olive oil");
		boil(2);
		add("Spaggeti Pasta");
		boil(9);
		mix(60);
		add("Parmesan chesse, Marinara");
		
	}
	public static void makePancakes() {
		System.out.println("PANCAKE RECEPI");
		add(" Milk, Eggs, Flour, Sugar ,Salt");
		mix(120);
		fry(3);
		System.out.println("Enjoy you pancakses");
		
	}
public static void add (String ing) {

System.out.println("Add"+ing);
}
public static void mix (int seconds) {
	System.out.println("Mix for "+seconds + " seconds");
}
public static void fry (int minutes) {
	System.out.println("Fry for "+ minutes + " minutes");
}
public static void boil( int minutes) {
	System.out.println("Boil it for " + minutes+ " minutes");
}
}
