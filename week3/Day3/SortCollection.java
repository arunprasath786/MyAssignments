package week3.Day3;

import java.util.ArrayList;
import java.util.Collections;

public class SortCollection {

	public static void main(String[] args) {
		String[] company = {"HCL","Wipro","Aspire Systems","CTS"};
		int length = company.length;
		System.out.println(length);
		
		ArrayList<String> comp = new ArrayList<String>();
		for(int i=0;i<company.length;i++) {
			comp.add(company[i]);
		}
		System.out.println("Company List: " +comp);
		Collections.sort(comp);
		Collections.reverse(comp);
		System.out.println("Reversed List:" + comp);
		

	}

}
