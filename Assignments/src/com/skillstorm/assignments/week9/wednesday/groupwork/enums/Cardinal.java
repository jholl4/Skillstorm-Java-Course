package com.skillstorm.groupwork.enums;

import com.skillstorm.groupwork.interfaces.Direction;

/**
 * An enum (a set of constants) that represents the cardinal directions on a
 * compass.
 * 
 * To learn more, read
 * https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html
 *
 */
public enum Cardinal implements Direction {

	// 1a Create an enum
	// that represents the cardinal directions on a compass
	NORTH,
	SOUTH,
	EAST,
	WEST;

	// 1b Return the opposite direction
	// Hint: Use the this keyword to see what the current direction is
	@Override
	public Cardinal reverse() {
		switch (this) {
			case NORTH:
				return SOUTH;
			case SOUTH:
				return NORTH;
			case EAST:
				return WEST;
			default:
				return EAST;
		}
	}
}
