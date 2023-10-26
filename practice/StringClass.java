package com.rd.practice;

public class StringClass {

	public static void main(String[] args) {
	
		StringBuilder sb = new StringBuilder(5);
		sb.append("rahul");
		String str = "";
		System.out.println("h"+sb);
		System.out.println(str+"f");
		if(str.equals(sb)) {
			System.out.println("match1");
		}
		else if(sb.toString().equals(str)) {
			System.out.println("match2");
		}
			

	}

}
