package com.skillstorm.assignments.week4.friday;

public class IceCream {
    private String flavor;
    private double price;
    
    
	/**
	 * @param flavor
	 * @param price
	 */
	public IceCream(String flavor, double price) {
		this.flavor = flavor;
		this.price = price;
	}
	/**
	 * @return the flavor
	 */
	public String getFlavor() {
		return flavor;
	}
	/**
	 * @param flavor the flavor to set
	 */
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString() {
		return flavor;
	}
    
    
}
