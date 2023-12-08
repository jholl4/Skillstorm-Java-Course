package com.skillstorm.assignments.week4.friday;


public class Customer {
    private IceCream iceCream;
    private String name;
    
    public Customer(String name, IceCream iceCream) {
    	this.name = name;
    	this.iceCream = iceCream;
    }
	/**
	 * @return the iceCream
	 */
	public IceCream getIceCream() {
		return iceCream;
	}
	/**
	 * @param iceCream the iceCream to set
	 */
	public void setIceCream(IceCream iceCream) {
		try {
			System.out.printf("%s has picked %s", name, iceCream.getFlavor());
		}catch(NullPointerException e) {
			System.out.printf("%s doesn't know what flavor they want...\n\n", name);
		}
		this.iceCream = iceCream;
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
	@Override
	public String toString() {
		return this.getName();
	}
	
	
    
    
}
