package com.rd.practice;

public class Excep {
   public static void main(String[] args) throws Exception{
	int a =20;
	System.out.println(args.length);
	try {
		return;
	} catch (Exception e) {
		
	}
	finally {System.out.println("finally block ");}
	System.out.println("this is last line");
	
	if(a<18){
		throw new ExceptionPractise2("aaaa");
//		Exception e=new ArithmeticException();
//		e.printStackTrace();
	}
}
}
