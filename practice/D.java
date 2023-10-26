package com.rd.practice;

import com.rd.practice.E;
//import com.rd.practice.E.F;

public class D{
	static int a=22;
	final String st="rr";
	public D(){
		System.out.println("constructor of D");
	}
	 protected static class Dinner{
		static int ar=55;
		public static void method1() {
			 D  ob = new D();
			System.out.println(a);
		}
	}
	public void D(){
		System.out.println("constructor of D");
	}
	public static void rr() {
		System.out.println(Dinner.ar);
		
		// new D();
	}
	public static void main(String []args){
		
		rr();
	
	
		 
	}
	{System.out.println("this is empty block");}
	static{
		System.out.println("this is static block1");
	}
	static{
		System.out.println("this is static block2");
	}
}
