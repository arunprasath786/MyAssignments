package javaChallenge;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class JavaChallenge04 {

	public static void main(String[] args) {
		int a [] = {2,2,1};
		int b[] = {4,1,2,1,2};

		Set<Integer> unique = new HashSet<Integer>();
		Set<Integer> duplicates = new HashSet<Integer>();
		for (Integer integer : a) {
			if(!unique.add(integer)) {
				duplicates.add(integer);
			}
		}
		System.out.println(unique);
		System.out.println(duplicates);
	}
}
