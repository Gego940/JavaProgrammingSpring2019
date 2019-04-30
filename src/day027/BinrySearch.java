package day027;

import java.util.Arrays;

public class BinrySearch {
public static void main(String[] args) {
	int nums[]= {4,6,7,10,55};
	Arrays.binarySearch(nums,7);
	Arrays.binarySearch(nums,55);
	System.out.println(Arrays.binarySearch(nums,10));
	int nums3[]= {4,10,20,50};
	System.out.println(Arrays.binarySearch(nums, 5));
	
}
}
