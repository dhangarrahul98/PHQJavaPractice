package com.rd.practice;

import java.util.Scanner;

public class PasswordMatching {
	static String[] pass = new String[5];;

	public static boolean checkSmallLater(String pass) {
		char smallChar = 'a';
		for (int i = 0; i < 26; i++) {
			if (pass.contains("" + smallChar)) {
				return true;
			}
			smallChar++;
		}
		return false;
	}

	public static boolean checkCapitalLater(String pass) {

		char capitalChar = 'A';
		for (int i = 0; i < 26; i++) {
			if (pass.contains("" + capitalChar)) {
				return true;
			}
			capitalChar++;
		}
		return false;
	}

	public static boolean checkNumber(String pass) {
		int num = 1;
		for (int i = 0; i < 10; i++) {
			if (pass.contains("" + num)) {
				return true;
			}
			num++;
		}
		return false;
	}

	public static boolean checkSymbol(String pass) {
		char[] symbol = { '@', '#', '*', '=' };
		for (int i = 0; i < 4; i++) {
			if (pass.contains("" + symbol[i])) {
				return true;
			}
		}
		return false;
	}

	public static boolean checkLength(String pass) {

		if (pass.length() > 4 && pass.length() < 11) {
			return true;
		}
		return false;
	}

	public static boolean checkSpace(String pass) {

		if (pass.contains(" ")) {
			return false;
		}
		return true;
	}

	public static String isPassSatisfy(String pass) {

		if (checkSpace(pass) && checkSmallLater(pass) && checkCapitalLater(pass) && checkNumber(pass)
				&& checkSymbol(pass) && checkLength(pass)) {
			return "PASS";
		}
		return "FAIL";
	}

	public static void takeValue() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 4 passwords:- ");
		for (int i = 0; i < 4; i++) {
			pass[i] = sc.nextLine();
		}
	}

	public static void main(String[] args) {
		takeValue();
		for (int i = 0; i < 4; i++) {
			System.out.println(isPassSatisfy(pass[i]));
		}
	}
}
