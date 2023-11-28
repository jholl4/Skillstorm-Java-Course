package com.skillstorm;

public class DuckGoose {

	public static void main(String[] args) {
		String[] birds = {"duck", "duck", "duck", "duck", "duck", "goose", "duck", "duck"};
		int counter = 0;
		while(counter <= birds.length - 1) {
			if (birds[counter].equals("duck")){
				System.out.println(birds[counter]);
			}
			counter++;
		}

	}

}
