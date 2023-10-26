package com.rd.practice;

public class HashCodeDotEquals {
	public static void main(String args[]) {
		
		String str1 = "rahul";
		String str2 = "rahul";
		String str3 = new String("rahul");
		String str4 = new String("rahul");
		String str5=str4;
		Integer num1 = new Integer(25);
		Integer num2 = new Integer(25);
		num1=34;
		
		int[] arr1= {10,20,30};							//Array is also an object
		int[] arr2= {10,20,30};
		String[] sarr1 = {"rahul","ram","shyam"};        
		String[] sarr2 = {"rahul","ram","shyam"};
		
		
		HashCodeDotEquals pr1=new HashCodeDotEquals();
		HashCodeDotEquals pr2 = pr1;

		System.out.println(str1==str2) ;
		System.out.println(str1==str3);
		System.out.println(str4==str3);
		System.out.println(str2==str5);
		System.out.println(num1==num2);
		System.out.println("****************************************");
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str3.equals(str4));
		System.out.println(num1.equals(num2));
		System.out.println("****************************************");
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		System.out.println(str5.hashCode());
		System.out.println("****************************************");
		System.out.println(num1.hashCode());
		System.out.println(num2.hashCode());		
		System.out.println("****************************************");
		System.out.println(pr1.hashCode());
		System.out.println(pr2.hashCode());
		System.out.println(pr2==pr1);
		System.out.println("****************************************");
		System.out.println(arr1.hashCode());
		System.out.println(arr2.hashCode());
		System.out.println(sarr1.hashCode());
		System.out.println(sarr2.hashCode());
	}
}
