package com.skillstorm.training;

// This is a comment that the compiler ignores, just for humans to read

// Shortcuts:
// ctrl+fwdslash comments out a line
// type sysout then ctrl+space to auto generate a print function
// F11 runs the program

/* This
 * is
 * a
 * multi-line
 * comment */

/* Important syntax:
 * -wrap all your code in curly braces
 * -make sure your class is named the same as the filename
 * -the class with the main method must be public */

public class HelloWorld {
	
	/* static - belongs to the class (we don't need an object to use this method)
	 * void - no return type (no data returned)
	 * main - the name of the function aka method name
	 * String[] args = the type and name of the inputs/arguments
	 * String - a sequence of characters */

	public static void main(String[] args) {
		System.out.println("Hello World");
		AsciiArt.draw("⠀⠀⠀⠀⠀⠀⣠⡤⠶⠒⢛⢻⠛⠛⠛⠛⠛⠛⢿⣛⡓⠶⢦⣤⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⡴⡫⠒⠊⠁⠀⣸⠀⠀⠀⠀⠀⠀⢹⠀⠀⠁⠒⡏⢳⡄⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⢀⡾⡑⡇⡀⠀⠀⠀⡷⠀⠀⠤⠤⠀⠀⢸⠀⠀⠀⠀⡇⡳⢻⡄⠀⠀⠀\r\n"
				+ "⠀⠀⢀⡾⢱⠔⠁⡇⠀⠀⠀⣇⠀⣀⣀⣀⣀⣀⣀⡇⠀⠀⠀⠃⠱⣵⢻⡄⠀⠀\r\n"
				+ "⠀⠀⡾⠁⢀⡀⢤⠗⠒⠒⢺⢳⠤⠶⠶⠶⠶⠶⢖⣷⠒⠒⠒⡦⢄⡀⠀⢹⡄⠀\r\n"
				+ "⠀⢸⡇⠐⣁⠤⠬⠤⠤⣤⣼⣷⣵⣶⣶⣶⣶⣶⣽⣿⢤⣤⠤⠷⠤⢄⡁⠘⣇⠀\r\n"
				+ "⠀⠘⣧⣞⣁⣀⡮⡯⡿⠛⠛⠫⠿⠭⠭⠭⠭⠽⠿⠛⠛⢻⠽⡿⣄⣀⣑⣦⠏⠀\r\n"
				+ "⠀⠀⣿⢠⣿⠃⠀⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡍⠁⠈⣿⡆⢸⠀⠀\r\n"
				+ "⠀⠀⣿⢸⣿⡀⠀⠀⠑⠄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠔⠀⠀⠀⣿⣇⢸⡀⠀\r\n"
				+ "⢀⣴⡏⠥⠹⢇⠀⠀⠀⠀⠑⠄⠀⠀⠀⠀⠀⠀⠤⠂⠁⠀⠀⠀⢠⠟⠥⠹⣧⡀\r\n"
				+ "⣿⡼⢶⡒⠲⡚⠳⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡴⠛⡲⠒⣲⠷⢹\r\n"
				+ "⣿⣗⡚⠨⠑⢌⠢⡘⠷⣤⣀⣴⣾⠻⠟⠛⠻⡻⣶⣄⣠⡴⠏⡠⢊⠔⡡⢺⢚⢸\r\n"
				+ "⠙⢯⣗⣀⡀⠀⠑⠂⠥⢂⠭⣛⢵⣖⣒⣒⢲⡦⢟⠭⣕⠪⠅⠊⠀⠀⣁⣘⣯⠞\r\n"
				+ "⠀⠀⢿⡑⢬⣑⢄⠀⠀⠀⠈⡟⡞⣯⣷⣢⢿⣇⡗⡏⠀⠀⠀⢀⢴⡁⢐⣹⠀⠀\r\n"
				+ "⠀⠀⠀⠙⢻⡈⠳⣗⢄⣼⠓⣟⡏⣄⠩⠭⢡⡊⣗⡗⣷⣄⣴⡹⠋⡾⠛⠁⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠳⣤⡈⣷⣿⣆⢸⡇⠛⠀⠀⠘⠃⣿⢀⣿⣷⢋⣠⠾⠃⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠉⠻⠦⣭⣽⠇⠿⠀⠀⠸⠃⣯⣭⡥⠞⠋⠁⠀⠀⠀⠀⠀⠀\r\n"
				+ "⢀⢀⣀⣀⣀⣀⣀⣀⣀⣀⣈⣳⣵⣶⣶⣷⣶⣾⡵⣋⣀⣀⣀⣀⢀⠀⠀⠀⠀⠀\r\n"
				+ "⣿⣟⣟⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣯⣽⣽⣯⣿");

	}

}
