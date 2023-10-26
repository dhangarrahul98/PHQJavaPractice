package com.rd.practice;

public class Shapes {
	
	public static void x() {
		for(int i=0;i<7;i++) {
			for(int j=0;j<7;j++) {
				int num = 6-i;
			if(j==i||j==num)System.out.print("*");
			else System.out.print(" ");
		 }
			System.out.println("");
		}
		System.out.println("\n-------------------------------------------\n");
	}	
	
	public static void x2() {
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				int num = 5-i;
			if(j==i||j==num)System.out.print("* ");
			else System.out.print(" ");
		 }
			System.out.println("");
		}
		System.out.println("\n-------------------------------------------\n");
	}
	
	public static void zero() {
		for(int i=0;i<7;i++) {
			for(int j=0;j<7;j++) {
				if(i==0||i==6) System.out.print("* ");
				else if(j==0||j==6)	System.out.print("* ");
				else System.out.print("  ");
			
		 }
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		 x();
		 x2();
		zero();
	}

}
