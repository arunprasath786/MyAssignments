package week3.Day3;

import java.util.ArrayList;
import java.util.Collections;

public class ListMissingElement {

	public static void main(String[] args) {
		int[] num = {1, 2, 3, 4, 10, 6, 8};
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<num.length;i++) {
			list.add(num[i]);
			
		}
		Collections.sort(list);
		System.out.println(list);
		for(int i=0;i<list.size()-1;i++) {
			
			if((list.get(i)+1) != list.get(i+1)) {
				System.out.println("condition met at index:" + i);
			}
			
			
		}


	}

}
