package day027;

import java.util.Arrays;

public class ArraysEquals {
public static void main(String[] args) {
	int[]nums1 = {4,5,6,10,100};
	int[]nums2 = {4,5,6,10,100};
	Arrays.equals(nums1, nums2);
	System.out.println(Arrays.equals(nums1, nums2));
	if(Arrays.equals(nums1, nums2)) {
		System.out.println("They exatcly the same");
	}else {
		System.out.println("MISSMATCH!!!!!!!!!!!!!");
	}
	
	String[]strArr1 = {"one","two","three"};
	String[]strArr2 = {"one","two","three"};
	
	System.out.println(Arrays.equals(strArr1, strArr2));
	boolean match =Arrays.equals(strArr1, strArr2);
	System.out.println(match);
}
}
