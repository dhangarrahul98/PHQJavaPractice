package com.rd.practice;

public class ExeptionPractice {

	public static void main(String[] args) {

		 int a=10,b=0,res=12;
		try {
			 res=a/b;
			 
		}catch(ArithmeticException e) {
			System.out.println(e.getClass());
			System.out.println(e);
		}
		System.out.println(res+"final line");
	}

}
