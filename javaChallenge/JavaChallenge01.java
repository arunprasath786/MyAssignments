package javaChallenge;

import java.util.ArrayList;
import java.util.List;

public class JavaChallenge01 {

	public static void main(String[] args) {
		String s1 = "Hello World";
		String s2="fly me to the moon";
		String s3 = "luffy is still joyboy";
		
		String[] split = s1.split(" ");
		List<String> list = new ArrayList<String>();
		for (int i=0;i<split.length;i++) {
			list.add(split[i]);
			
		}
		System.out.println("List:" +list);
		System.out.println("length of last word:" + list.get(1).length());

	}

}
