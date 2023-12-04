package com.skillstorm.assignments.week4.monday;

import java.util.Arrays;

public class Programmer {
	
	private String name;
	private String employer;
	private String[] knownLanguages;
	
	
	/**
	 * @param name(String)
	 * @param employer(String)
	 * @param knownLanguages (String var arg
	 */
	public Programmer(String name, String employer, String...strings ) {
		this.name = name;
		this.employer = employer;
		// Check for null and empty strings, set length of language array and initialize it
		int knownLanguagesLength = 0;
		for (String language : strings) {
			if(language != null && !(language.equals(""))) {
				knownLanguagesLength++;
			}
		}
		this.knownLanguages = new String[knownLanguagesLength];
		// Add strings arguments to language array if not null or empty
		int i = 0; // counter for below for loop
		for (String string : strings) {
			if (string != null && !(string.equals(""))) {
				knownLanguages[i] = string;
				i++;
			}
		}
//		while(i < strings.length) {
//			if (strings[i] != null && !(strings[i].equals(""))) {
//				knownLanguages[i] = strings[i];
//				i++;
//			}
//		}
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the employer
	 */
	public String getEmployer() {
		return employer;
	}


	/**
	 * @param employer the employer to set
	 */
	public void setEmployer(String employer) {
		this.employer = employer;
	}


	/**
	 * @return the knownLanguages
	 */
	public String[] getKnownLanguages() {
		return knownLanguages;
	}


	/**
	 * @param knownLanguages the knownLanguages to set
	 */
	public void setKnownLanguages(String[] knownLanguages) {
		this.knownLanguages = knownLanguages;
	}
	
	/**
	 * Teach the programmer a new language
	 * @param language
	 */
	public void learnLanguage(String language) {
		if (language == null || language.equals("")) {
			System.out.printf("Sorry, invalid language.%n%n");
			return;
		}
		System.out.printf("%s is learning %s!%n%n", name, language);
		String[] newKnownLanguages = new String[knownLanguages.length + 1];
		for(int i = 0; i < knownLanguages.length; i++) {
			newKnownLanguages[i] = knownLanguages[i];
		}
		newKnownLanguages[newKnownLanguages.length - 1] = language;
		knownLanguages = newKnownLanguages;
	}
	
	/**
	 * Remove a language from the programmer's repertoire
	 * @param language
	 */
	public void forgetLanguage(String language) {
		System.out.printf("%s didn't practice their %s and is forgetting it...%n%n", name, language);
		String[] newKnownLanguages = new String[knownLanguages.length - 1];
		int knownCounter = 0;
		int newCounter = 0;
		while(knownCounter < knownLanguages.length) {
			if(!knownLanguages[knownCounter].equalsIgnoreCase(language)) {
				newKnownLanguages[newCounter] = knownLanguages[knownCounter];
				knownCounter++;
				newCounter++;
			}else {
				knownCounter++;
			}
		}
		knownLanguages = newKnownLanguages;
		
	}
	
	@Override
	public String toString() {
		return String.format(
				"--------------------%n"
				+ "Programmer Details%n"
				+ "--------------------%n"
				+ "Name: %s%n"
				+ "Employer: %s%n"
				+ "Known Languages: %s%n%n",
				this.name,
				this.employer,
				Arrays.toString(knownLanguages));
		
	}
	
	/**
	 * Creates a comparison array to store elements of both objects' language arrays if equal
	 * - If any elements of the argument object's array are not present in this object's array,
	 * 		they will not be added to the comparison array.
	 * - Once comparison array logic is finished, if comparison array contains any null
	 *  elements,
	 *  	method returns false.
	 */
	@Override
	public boolean equals(Object obj) {
		if(obj==this)
			return true;
		if(obj==null)
			return false;
		if(obj.getClass() != this.getClass())
			return false;
		
		Programmer other = (Programmer) obj;
		
		// Return false if arrays are not the same size
		if(this.getKnownLanguages().length != other.getKnownLanguages().length)
			return false;
		
		String[] compareArray = new String[this.getKnownLanguages().length];
		for(int i = 0; i < this.getKnownLanguages().length; i++) {
			
			// temp string to store current compared array element from other
			String currentLang = other.getKnownLanguages()[i];
//			System.out.println("currentLang is: " + currentLang);
			
			// iterate through known languages add add to compareArray if match is found
			// and skips over any that don't match (resulting in a null element in compareArray)
			for(String knownLang : this.getKnownLanguages()) {
//				System.out.printf("comparing %s to %s%n%n", knownLang, currentLang);
				if(knownLang.equalsIgnoreCase(currentLang)) {
//					System.out.println("Adding current language to compareArray index " + i);
					compareArray[i] = currentLang;
//					System.out.println("compareArray contents: " + Arrays.toString(compareArray));
					break;
				}
			}
		}
		// return false if compareArray contains any null elements
		for(String element : compareArray) {
			if(element == null)
				return false;
		}
		return true;
	}
	
	

}


