package com.skillstorm.test;

import java.util.*;

public class Test {

	public static void main(String[] args) throws Exception {
		int counter = 0;
		outer: for (int i = 0; i < 3; i++) {
			middle: for (int j = 0; j < 3; j++) {
				inner: for (int k = 0; k < 3; k++) {
					if (k - j > 0) {
						break middle;
					}
					counter++;
				}
			}
		}
		System.out.println(counter);
	}

	public static int value(short num1, short num2) {
		int answer = num1 * num2;
		return answer;
	}

}
