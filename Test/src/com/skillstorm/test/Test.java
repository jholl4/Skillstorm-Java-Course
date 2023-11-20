package com.skillstorm.test;

public class Test {

	public static void main(String[] args) {
		boolean isHot = false;
		boolean isHumid = false;
		System.out.println(!(isHot||isHumid));
		value((short) 2, (short)3);

	}
	
	public static int value(short num1, short num2) {
		int answer = num1*num2;
		return answer;
	}

}
