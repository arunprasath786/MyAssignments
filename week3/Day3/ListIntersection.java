package week3.Day3;

import java.util.ArrayList;

public class ListIntersection {

	public static void main(String[] args) {
		int[] a = {3,2,11,4,6,7};
		int[] b = {1,2,8,4,9,7};
		ArrayList<Integer> list_A = new ArrayList<Integer>();
		ArrayList<Integer> list_B = new ArrayList<Integer>();
		for(int i=0;i<a.length;i++) {
			list_A.add(a[i]);
		}
		for(int j=0;j<b.length;j++) {
			list_B.add(b[j]);
		}
			
			System.out.println(list_A);
			System.out.println(list_B);
			int len = list_A.size();
						
		
	for(int i=0;i<=len-1; i++) {
			Integer integer1 = list_A.get(i);
			Integer integer2 = list_B.get(i);
			if(integer1.equals(integer2)) {
				System.out.println("Has same values for index:" + "" + i);
			}
		}
			
		}
	}
		

	



