package com.sample.utility;

import java.util.Arrays;

public class Tester {
	
	public static void  main(String arg[]){
		/*int i = 121;
		String s = String.valueOf(i);
		StringBuffer sb = new StringBuffer(s);
		String revStr = new String(sb.reverse());
		if(s.equals(revStr)){
			System.out.println("Yes...");
		} else 
			System.out.println("No...");*/		
		String s = "Welcome asdjkweeekkd kekekkakdksd";
		
		Integer s1 = Integer.parseInt("123");
		System.out.println(s1);
		int count = 0;
		String str = "";
		char ch[] = s.toCharArray();
		char ch1[] = new char[s.length()];
		int n = s.length();
		for(char c:ch){
			if(c=='e')				
			count++;
			ch1[--n] = c;
		}
		System.out.println(count);
		for(char c:ch1){
			if(c != 'e')
				str = str+c+"";
		}	
		System.out.println(str);
	}

}
