
public class Shopping {
public static void main(String[] args) {
	String[]products = {"Timberland Shoes","H&M Shirt","Swatch Watch","Gucci bag","Addidas socks"}; 
	double[]prices = {120.0,5.99,150.50,3000.5,6.99};
	int[]itemsId = {12345,12346,12356,12365,12385};
	//print count of products
	System.out.println("Products count: "+products.length);
	
	//check if products prices and items ids have same count
	if(products.length==prices.length && itemsId.length==products.length) {
		System.out.println("Shopping list looks good");
	}else {
		System.out.println("Something is wrong on that list");
		return;
	}
	//loop through products and priint each one in seperate line
	for(String p : products ) {
		System.out.println(p);
	}
	//prices for loop
	for(int i = 0; i<prices.length; i++) {
		System.out.println(prices[i]);
	}
	//itemId---> print in reverse order
	for(int idx = itemsId.length-1;idx>=0;idx--) {
		System.out.println(itemsId[idx]);
	}
	//print a report with a total price.
	//item1:12345 - Timberland shoes - $120.0
	//...
	//Total price is...
	System.out.println("#####YOUR SHOPPING RECEIPT######");
	double TotalPrice = 0.0;
	for(int i = 0; i < products.length; i++) {
		System.out.println("Item "+(i+1) +": "+ itemsId[i] + "-"+products[i] + "- $"+ prices[i]);
		TotalPrice+=prices[i];
		
	}
	System.out.println("Total price: $"+TotalPrice);
	//Find the most expensive item in your list and print it as a report
	int max = 0;
	double maxPrice = 0;
	int maxIndex=0;
	
	for(int j=0; j < prices.length; j++) {
		if(prices[j]> maxPrice) {
			maxPrice=prices[j];
			maxIndex = j;
			
		}
	}
	System.out.println(itemsId[maxIndex]+"-"+ products[maxIndex]+"- $"+maxPrice);
	
	
	
	
	
	
	
	
	
}
	}

