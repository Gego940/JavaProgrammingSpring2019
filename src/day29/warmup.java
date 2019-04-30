package day29;

import java.util.Arrays;

public class warmup {
	public static void main(String[] args) {

		String[][] countriesArray = { { "USA", "Washington DC" }, { "Canada", "Ottawa" }, { "Mexico", "Mexico city" },
				{ "Brasil", "Brasilia" }, { "Peru", "Lima" }, { "Argentina", "Buenas Aeres" }, { "Bolivia", "La Paz" },
				{ "Macedonia", "Skopje" }, { "Kazakhstan", "Nursultan" }

		};
		// String[][]c=new String[9][2];
//	c[0][0]="USA";
		// c[0][1]="Washington DC";

		System.out.println(countriesArray[0][0] + "|" + countriesArray[0][1]);
		System.out.println(countriesArray[8][0] + "|" + countriesArray[8][1]);
		System.out.println(Arrays.deepToString(countriesArray));
//for loop
		for (int i = 0; i < countriesArray.length; i++) {
			System.out.print(countriesArray[i][0] + "|");
		}
		System.out.println();
//for each
		for (String[] country : countriesArray) {
			System.out.print(country[0] + "|");
		}
//get all the cities and add to cities[] array
		String[] cities = new String[countriesArray.length];
		System.out.println(Arrays.toString(cities));
		for (int i = 0; i < countriesArray.length; i++) {
			cities[i] = countriesArray[i][1];
		}
		System.out.println(Arrays.toString(cities));
		//look for Bolivia in the countriesArr and test if capital city is LaPaz
		for(int row = 0; row <countriesArray.length; row ++) {
			if(countriesArray[row][0].contentEquals("Bolivia")) {
			//	System.out.println(countriesArray[row][1]);
				if(countriesArray[row][1].contentEquals("La Paz")) {
					System.out.println("Bolivia test passed");
				}else {
					System.out.println("Bolivia test failed");
				}
				break; //exit the loop
			}
		}
	}
}