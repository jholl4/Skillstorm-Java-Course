package com.skillstorm.groupwork.enums;

/**
 * This class is used to represent something left-handed or right-handed.
 *
 * To learn more about enums, read
 * https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html
 */
public enum Hand {

	// 2a Create an enum
	// that represents the constants right and left
	LEFT,
	RIGHT;

	// 2b Return the opposite
	// Hint: Use the this keyword to see what the current value is
	public Hand reverse() {
		switch (this) {
			case RIGHT:
				return LEFT;
			default:
				return RIGHT;
		}

	}

}
