package com.rd.practice;
import java.util.Scanner;

public class IncreasingRecordPrint {

	public static void main(String[] args) {
		System.out.println("Enter 10 record...");
		Scanner sc=new Scanner(System.in);
		String records[]=new String[10]; 
		for(int i=0;i<10;i++) 
		{
			records[1]=sc.next();
		}
		System.out.println(records.toString());
	}

}
