package com.skillstorm;

public class RethrowExample{
	
	public static void main(String[] args) {
		Person person = new FrugalPerson();
		Food apple = new Apple("Pink Lady", true);
		try {
			person.eat(apple);
		} catch (RottenFoodException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Have a nice day.");
	}
	
}

class RottenFoodException extends Exception{

	private static final long serialVersionUID = 2734023321695086763L;
	
	public RottenFoodException(String message) {
		super(message);
	}
	
	public RottenFoodException(String message, Throwable cause) {
		super(message, cause);
	}
	
}

class RottenMangoException extends RottenFoodException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2646037393923298967L;

	public RottenMangoException(String message, Throwable cause) {
		super(message, cause);
	}
}

class Food {

	private boolean isRotten;
	private String name;
	
	public Food(String name, boolean isRotten) {
		this.name = name;
		this.isRotten = isRotten;
	}

	/**
	 * @return the isRotten
	 */
	public boolean isRotten() {
		return isRotten;
	}

	/**
	 * @param isRotten the isRotten to set
	 */
	public void setRotten(boolean isRotten) {
		this.isRotten = isRotten;
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
	
	public String toString() {
		if(isRotten) {
			return "The " + name + " should not be eaten.";
		}else {
			return "The " + name + " is okay to eat.";
		}
	}
	
	

}

class Person{
	
	void eat(Food food) throws RottenFoodException{
		if (food.isRotten()) {
			throw new RottenFoodException("The " + food.getName() + " is rotten");
		}
		System.out.println("Eating the " + food.getName() + ".");
	}
	public void eat(Mango fruit) throws RottenMangoException{
		// call the parents eat(food) then rethrow a different exception
		try {
			eat(fruit);
		}catch (RottenFoodException e){
			throw new RottenMangoException(e.getMessage(), e);
		}
	}
	
}

class FrugalPerson extends Person{
	// Don't throw away rotten food!
	@Override
	public void eat(Food food) {
		if(food.isRotten()) {
			System.out.println("Eating the " + food.getName() + ", but it is rotten.\n"
					+ " Try cutting off the rotten bit.");
		}
		System.out.println("Eating the " + food.getName() + ".");
	}
}

class Apple extends Food{
	
	public Apple(String name, boolean isRotten) {
		super(name, isRotten);
	}
	
}

class Mango extends Food{
	
	public Mango(String name, boolean isRotten) {
		super(name, isRotten);
	}
	
}