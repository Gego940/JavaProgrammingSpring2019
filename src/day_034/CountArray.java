package day_034;

public class CountArray {
public static void main(String[] args) {
	 int[]nums = {2,3,4,5,5,6,6,6,7,5,5,12};
	 // 1)with print return right away
	 System.out.println(findOccurences(nums, 5));
	 System.out.println(findOccurences(nums, 6));
	 
	 // 2) assigned return value into a variaable
	int five = findOccurences(nums, 5);
	System.out.println("5 values: "+five);
	
	//CREATE AN ARRAY AND PASS THE METHOD
	int twenty=findOccurences(new int[] {10,20,20,30,55,22}, 20);
	System.out.println("twenty: " + twenty);
	
}

	public static int findOccurences(int[] array, int value) {
		int counter = 0;
		for (int num : array) {
			if (num == value) {
				counter++;

			}
		}
		return counter;
	}

	
	}

