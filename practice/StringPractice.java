package com.rd.practice;

public class StringPractice extends A{
	
//	static Object []num= new Object[5];
	public StringPractice(int b,int a){
		super(a);
		System.out.println("construstor of StringPractice  "+b);
	}
	public void ma() {
		System.out.println("new class");

	}
	
	public static void main(String []args) {
//		num[1]=new Integer(10);
//		num[2]=new Float(25.50);
//		num[3]=new Double(15.50);
//		num[4]=new Integer(40);
//		
//		Integer nn= (Integer)num[2];
//		
//		for(Object e:num) {
//			System.out.println(nn);
		StringPractice ob= new StringPractice(10,20);
		ob.m();
		
	}
	 
	
}
