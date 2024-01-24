package com.skillstorm.test;

import java.util.*;

class X {
	public X() {
		System.out.println("In X");
	}
}

class Y extends X {
	public Y() {
		super();
		System.out.println("In Y");
	}
}

class Z extends Y {
	public Z() {
		System.out.println("In Z");
	}
}

public class Test {
	public static void main(String[] args) {
		Y y = new Z();
	}
}
