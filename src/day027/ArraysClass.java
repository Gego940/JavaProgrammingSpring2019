package day027;

import java.util.Arrays;

public class ArraysClass {
public static void main(String[] args) {
	int[]nums = {43 ,12, 4,1, 3, 5};
	System.out.println(Arrays.toString(nums));
	String str=Arrays.toString(nums);
	System.out.println(str);
	Arrays.sort(nums);
	System.out.println(Arrays.toString(nums));
	String[]language = {"Zulu","Spanish","Italian","English","Polish"};
	System.out.println(Arrays.toString(language));
	Arrays.sort(language);
	System.out.println(Arrays.toString(language));
	
	int[]nums2 = {345,656,3333,11,3,66};
	Arrays.sort(nums2);
	System.out.println(Arrays.toString(nums2));
	
	int lowest = nums2[0];
	int larges= nums2[nums2.length-1];
	System.out.println(lowest);
	System.out.println(larges);
	int nums3[]= {4,10,20,50};
	Arrays.binarySearch(nums,10);
	Arrays.binarySearch(nums,20);
}
}
