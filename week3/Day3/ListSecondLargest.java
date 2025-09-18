package week3.Day3;

import java.util.ArrayList;
import java.util.Collections;

public class ListSecondLargest {

	public static void main(String[] args) {
		int[] num = {3,2,11,4,6,7};
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<num.length;i++) {
			list.add(num[i]);	
		}
		System.out.println(list);
		Collections.sort(list);
		Integer secondLargest = list.get(num.length-2);
		System.out.println("Second largest number in the list is:" + secondLargest);
	}

}
