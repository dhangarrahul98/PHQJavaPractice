package com.rd.practice;

import java.io.EOFException;
import java.io.IOException;
import java.sql.SQLException;

class Machine {
	public boolean turnOn() throws IOException,SQLException{
		return true;
	}}

public class Robot extends Machine {
		public boolean turnOn() throws EOFException,SQLException {
			return false;
		}

		public static void main(String[] doesNotCompute) throws Exception {
			Machine m = new Robot();
			System.out.print(m.turnOn());
		}
}