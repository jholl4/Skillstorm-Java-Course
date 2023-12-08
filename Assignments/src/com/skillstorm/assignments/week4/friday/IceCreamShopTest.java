package com.skillstorm.assignments.week4.friday;

public class IceCreamShopTest {
	
    public static void main(String[] args) {
    	// create ice cream objects for shop
		IceCream vanilla = new IceCream("Vanilla", 2.50);
		IceCream choc = new IceCream("Chocolate", 2.75);
		IceCream neo = new IceCream("Neopolitan", 3.50);
		IceCream straw = new IceCream("Strawberry", 2.25);
		IceCream schnoz = new IceCream("Schnozberry", 10.00);
		
		
		Customer josh = new Customer("Josh", choc);
		Customer bailey = new Customer("Bailey", straw);
		Customer flynn = new Customer("Flynn", vanilla);		
		
		
		IceCreamShop scoops = new IceCreamShop("Scoops");
		
		scoops.addCustomer(bailey);
		scoops.addCustomer(josh);
		scoops.addCustomer(flynn);
		
		scoops.addFlavor(vanilla);
		scoops.addFlavor(choc);
		scoops.addFlavor(neo);
		
		System.out.println(scoops);
		
		try {
			scoops.addFlavor(neo);
		}catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		scoops.addFlavor(straw);
		
		System.out.println(scoops);
		try {
			scoops.serviceCustomer();
			scoops.serviceCustomer();
			scoops.serviceCustomer();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println(scoops);
		
		try {
			bailey.setIceCream(schnoz);
			scoops.addCustomer(bailey);
			scoops.serviceCustomer();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		bailey.setIceCream(straw);
		scoops.serviceCustomer();
		
		System.out.println(scoops);
		
		josh.setIceCream(null);
		scoops.addCustomer(josh);
		
		System.out.println(scoops);
		
		try {
			scoops.serviceCustomer();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
