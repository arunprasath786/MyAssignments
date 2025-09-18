package week3.Day3;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class LearnSet {

	public static void main(String[] args) {
		String CompanyName = "Google";
		//Using Set
		Set<Character> unique = new LinkedHashSet<Character>();
		for (int i=0;i<CompanyName.length();i++) {
			char charAt = CompanyName.charAt(i);
			unique.add(charAt);
			
		}
		System.out.println("Set:" +unique);
		
		//Using List
		ArrayList<Character> list = new ArrayList<Character>();
		for (int i=0;i<CompanyName.length();i++) {
			char charAt = CompanyName.charAt(i);
			list.add(charAt);
		}
		//Collections.sort(list);
		System.out.println("List:" +list);
	}

}
