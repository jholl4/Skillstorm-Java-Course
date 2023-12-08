package com.skillstorm.assignments.week4.friday;

import java.util.ArrayList;

/**
* Fully encapsulate the IceCreamShop class
*/
public class IceCreamShop {

    private String name;
    private double amountEarned;
    private ArrayList<IceCream> flavors; // Are the flavors available at a given store
    private ArrayList<Customer> customerLine = new ArrayList<>(); 
    
    public IceCreamShop(String name) {
    	this.name = name;
    	this.amountEarned = 0.00;
    	this.flavors = new ArrayList<>();
    	this.customerLine = new ArrayList<>();
    }
    public IceCreamShop(String name, ArrayList<IceCream> flavors) {
    	this.name = name;
    	this.amountEarned = 0.00;
    	this.flavors = flavors;
    	this.customerLine = new ArrayList<>();
    }
    public IceCreamShop(String name, ArrayList<IceCream> flavors, ArrayList<Customer> customers) {
    	this.name = name;
    	this.amountEarned = 0.00;
    	this.flavors = flavors;
    	this.customerLine = customers;
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
	 * @return the amountEarned
	 */
	public double getAmountEarned() {
		return amountEarned;
	}

	/**
	 * @param amountEarned the amountEarned to set
	 */
	public void setAmountEarned(double amountEarned) {
		this.amountEarned = amountEarned;
	}

	/**
	 * @return the flavors
	 */
	public ArrayList<IceCream> getFlavors() {
		return flavors;
	}

	/**
	 * @param flavors the flavors to set
	 */
	public void setFlavors(ArrayList<IceCream> flavors) {
		this.flavors = flavors;
	}

	/**
	 * @return the customerLine
	 */
	public ArrayList<Customer> getCustomerLine() {
		return customerLine;
	}

	/**
	 * @param customerLine the customerLine to set
	 */
	public void setCustomerLine(ArrayList<Customer> customerLine) {
		this.customerLine = customerLine;
	}

	/*
     * 
     * This function services the customer at the front of the customer line and adds their total ice cream cost to the line before
     * removing them from the line.
     * 
     * If they do not have an ice cream (null value) throw an IllegalArgumentException
     * If they have a flavor that's not in the flavors list, throw an IllegalArgumentException
     * 
     * HINT: For IceCream comparison, compare the two Ice Cream's String flavors
     */
    public void serviceCustomer() throws IllegalArgumentException{
    	System.out.println("Next customer to the register, please!\n");
    	if(customerLine.get(0).getIceCream() == null) throw new IllegalArgumentException("Cannot serve a customer unless they choose a flavor.");
    	if( !(flavors.contains(customerLine.get(0).getIceCream()))) throw new IllegalArgumentException("Cannot serve ice cream that the shop does not have in its list.\n");
    	amountEarned += getCustomerLine().get(0).getIceCream().getPrice();
    	System.out.printf("Serving %s!\n\n", customerLine.get(0));
    	getCustomerLine().remove(0);
    }
    
    /*
     * 
     * This function adds a customer to the back of the line
     */
    public void addCustomer(Customer c) {
    	System.out.printf("%s has gotten in line.\n\n", c.getName());
        customerLine.add(c);
    }
    
    /*
     * This function should add a flavor to the ice cream list
     * HINT: For IceCream comparison, compare the two Ice Cream's String flavors
     */
    public void addFlavor(IceCream flavor)throws IllegalArgumentException {
    	System.out.printf("Attempting  to add %s to the menu of %s:\n\n", flavor, name);
        if(flavors.contains(flavor)) throw new IllegalArgumentException("That flavor is already on the list.\n");
        flavors.add(flavor);
        System.out.println("Success!\n");
    }
    
    /*
     * This function should remove a flavor from the ice cream list
     * HINT: For IceCream comparison, compare the two Ice Cream's String flavors
     */
    public void removeFlavor(IceCream flavor) {
        if(!flavors.contains(flavor)) throw new IllegalArgumentException("Attempted to remove a flavor that wasn't on the list.");
        if(flavors == null) throw new NullPointerException("Cannot remove a null value from this list.");
        flavors.remove(flavor);
    }
    
    public String toString() {
    	return String.format("%s has %d flavors: %s. %d customers are in line: %s. So far, %s has made $%.2f.\n", getName(), flavors.size(), flavors, customerLine.size(), customerLine, getName(), getAmountEarned());
    }

}
