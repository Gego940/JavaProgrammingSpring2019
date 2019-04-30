package day32;

import java.util.Arrays;

public class ArrayParametars {
	public static void main(String[] args) {
		int[]one= {10,2,3};
		int[]two= {3,1};
		int[]myArray = {44,22,66,11};
		printArray(myArray);
		printArray(new int[] {33,45,5,7});
		int[]myNums = new int []{3,4,5,6,7,8,34,64,3,6,3};
		printArray(myNums);
		
	}		
				
public static void printArray(int[]nums) {
	for(int n : nums  ) {
		System.out.print(n + " ");
	}
	System.out.println();
	
}
public static void print2ArraysV2(int[] arrNums1,int[]arrNums2) {
	if(arrNums1.length> arrNums2.length) {
		System.out.println(Arrays.toString(arrNums1));
		System.out.println(Arrays.toString(arrNums2));
	}else {
		System.out.println(Arrays.toString(arrNums2));
		System.out.println(Arrays.toString(arrNums1));
	}
}
}
