package com.rd.practice;
import java.util.Arrays;

import com.rd.practice.E;
public class E {
	
	 public void sum1() 
	 {
		 int a=20,b=50;
		 
		 System.out.println("E class final method sum");
		 
		 System.out.println("aa");
		 
	 }
	
	public static void main(String[] args) 
	{
		float fd=1f;
		 int []arr=new int[]{0,1,2,3,4,5};
		 String arr3[]= new String[]{"1","2","10"};
		 
		 Integer arr1[]=new Integer[5];
		 System.out.println(arr[2]);
		 Arrays.sort(arr3);
		 System.out.println(Arrays.toString(arr3));
		 System.out.println(arr3[(int)fd]);
		 
		 Object[] names=new String[3];
		 names[0]=new Integer(0);
//		 names[1]=new String("rahul");
//		 names[2]=new String("rahul");
		 
	//	 names[1]=new E();
	//	((E)names[1]).sum1();
	}
}
