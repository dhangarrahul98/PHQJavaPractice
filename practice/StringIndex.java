package com.rd.practice;
import java.util.Scanner;

public class StringIndex {

	public static void main(String[] args) {
//	String str = "the quick brown fox jumps over the lazy dog";
//	Scanner scn = new Scanner(System.in);
//	System.out.println("Enter your character here:-  ");
//	char ch= scn.next().charAt(0);
//	System.out.println("Index of your character is:= "+str.indexOf(ch));
//	System.out.println("Last Index of your character is:= "+str.lastIndexOf(ch));
		
//		String obj = "hello";
//		String obj1 = "world";
//		double arr[] = {1,1.5,5,67,5,5.8,10.6};
//		for(int i=0;i<arr.length; i++) {
//			
//			System.out.println(arr[i]);
		String cc[]= {"a","b","c","a","c"};
		for(int i=0;i<cc.length;++i){
			for(int j=0;j<cc.length;++j){
				if(cc[i].compareTo(cc[j])==0) {System.out.print(cc[j]);}
			}
		}
			
		}
				

	}

