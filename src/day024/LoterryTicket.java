package day024;

import java.util.Arrays;

public class LoterryTicket {

	public static void main(String[] args) {
		int[] lotteryNumbers = {12, 45, 3, 62, 42, 90};
		System.out.println(Arrays.toString(lotteryNumbers));
Arrays.sort(lotteryNumbers);
System.out.println(Arrays.toString(lotteryNumbers));
int index= Arrays.binarySearch(lotteryNumbers,45);
System.out.println("Position: "+index);




	}
	}
