package week2.Day2;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		int [] a = {1,4,3,2,8,6,7};
		// 1 2 3 4 6 7 8
		Arrays.sort(a);
for(int i=1;i<a.length;i++) {
	if(i!= a[i-1]) {
		System.out.println(i);
		break;
	}
	
}
	}

}
