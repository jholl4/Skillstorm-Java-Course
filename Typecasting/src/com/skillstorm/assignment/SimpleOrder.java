package com.skillstorm.assignment;

// I did have trouble with a couple of questions.
// Question 9, I didn't account for the fact that I
// was storing the result in an integer and that it could be lower than the minimum short value.
// Questions 3 and 4 of Type Casting, I know that the value overflows when narrow casting, but I 
// wasn't able to get the correct value until I used Java.
// Question 5 of Type casting, I had to store the value in a long before Eclipse would let me store
// it in an int.

public class SimpleOrder {
	
	public static void main(String[] args) {
		modulus();
		orderOfOps();
		integer();
		typeCast();
	}
	
	private static void modulus() {
		int counter = 1;
		System.out.println("Modulus answers:");
		System.out.print(counter + ". ");
		int mQ1 = 5+7%6;
		System.out.println(mQ1);
		counter ++;
		System.out.print(counter + ". ");
		int mQ2 = 12%6;
		System.out.println(mQ2);
		counter ++;
		System.out.print(counter + ". ");
		int mQ3 = 6%12;
		System.out.println(mQ3);
		counter ++;
		System.out.print(counter + ". ");
		int mQ4 = 3%5;
		System.out.println(mQ4);
		counter ++;
		System.out.print(counter + ". ");
		int mQ5 = 5%3;
		System.out.println(mQ5);
		counter ++;
		System.out.print(counter + ". ");
		int mQ6 = 5%5;
		System.out.println(mQ6);
		counter ++;
		System.out.print(counter + ". ");
		int mQ7 = 1%-2;
		System.out.println(mQ7);
		counter ++;
		System.out.print(counter + ". ");
		int mQ8 = -1%2;
		System.out.println(mQ8);
		counter ++;
		System.out.print(counter + ". ");
		int mQ9 = -1%-2;
		System.out.println(mQ9);
		counter ++;
		System.out.print(counter + ". ");
		int mQ10 = 0%2;
		System.out.println(mQ10);
		counter ++;
		System.out.print(counter + ". ");
		String mQ11 = "Divide by zero error";
		System.out.println(mQ11);
		counter ++;
		System.out.print(counter + ". ");
		int mQ12 = 6*2%6;
		System.out.println(mQ12);
		counter ++;
		System.out.print(counter + ". ");
		int mQ13 = 12%4;
		System.out.println(mQ13);
		counter ++;
		System.out.print(counter + ". ");
		int mQ14 = 7%3%2;
		System.out.println(mQ14);
		counter ++;
	}
	
	private static void orderOfOps() {
		int counter = 1;
		System.out.println("Order of operations answers:");
		System.out.print(counter + ". ");
		int oQ1 = 10-12*2;
		System.out.println(oQ1);
		counter ++;
		System.out.print(counter + ". ");
		int oQ2 = 5*(3-2);
		System.out.println(oQ2);
		counter ++;
		System.out.print(counter + ". ");
		int oQ3 = 5+2*3;
		System.out.println(oQ3);
		counter ++;
		System.out.print(counter + ". ");
		int oQ4 = 7+2*3/5-1;
		System.out.println(oQ4);
		counter ++;
		System.out.print(counter + ". ");
		int oQ5 = 18/3%7*(4+1);
		System.out.println(oQ5);
		counter ++;
		
	}
	
	private static void integer() {
		int counter = 1;
		System.out.println("Integer Arithmetic answers:");
		System.out.print(counter + ". ");
		int iQ1 = 15/3/5;
		System.out.println(iQ1);
		counter ++;
		System.out.print(counter + ". ");
		int iQ2 = 1/2;
		System.out.println(iQ2);
		counter ++;
		System.out.print(counter + ". ");
		int iQ3 = 3/4;
		System.out.println(iQ3);
		counter ++;
		System.out.print(counter + ". ");
		int iQ4 = 4/3;
		System.out.println(iQ4);
		counter ++;
		System.out.print(counter + ". ");
		int iQ5 = Integer.MAX_VALUE + 1;
		System.out.println(iQ5);
		counter ++;
		System.out.print(counter + ". ");
		int iQ6 = Integer.MIN_VALUE - 1;
		System.out.println(iQ6);
		counter ++;
		System.out.print(counter + ". ");
		int iQ7 = Integer.MAX_VALUE + Integer.MIN_VALUE;
		System.out.println(iQ7);
		counter ++;
		System.out.print(counter + ". ");
		int iQ8 = Short.MAX_VALUE + 1;
		System.out.println(iQ8);
		counter ++;
		System.out.print(counter + ". ");
		int iQ9 = Short.MIN_VALUE - 1;
		System.out.println(iQ9);
		counter ++;
		System.out.print(counter + ". ");
		int iQ10 = Short.MAX_VALUE + Short.MIN_VALUE;
		System.out.println(iQ10);
		counter ++;
	}
	
	private static void typeCast() {
		int counter = 1;
		System.out.println("Type Casting answers:");
		System.out.print(counter + ". ");
		int tQ1 = (int) 7.9-3;
		System.out.println(tQ1);
		counter ++;
		System.out.print(counter + ". ");
		int tQ2 = (int) 84.3/(int) 2.8;
		System.out.println(tQ2);
		counter ++;
		System.out.print(counter + ". ");
		int tQ3 = (byte) 1000-10;
		System.out.println(tQ3);
		counter ++;
		System.out.print(counter + ". ");
		int tQ4 = (short) 100000;
		System.out.println(tQ4);
		counter ++;
		System.out.print(counter + ". ");
		long tQ5 = 10 + -10;
		int tQ5a = (int) tQ5;
		System.out.println(tQ5a);
		counter ++;
	}

}
