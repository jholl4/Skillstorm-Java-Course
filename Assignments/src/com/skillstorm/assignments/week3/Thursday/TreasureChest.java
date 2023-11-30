package com.skillstorm.assignments.week3.Thursday;

public class TreasureChest {

    private double weightInLbs;

    private double heightInFt;

    private double lengthInFt;

    private double widthInFt;

    private boolean isLocked;
    
    private Treasure[] contents;
    
    
	public double getWeightInLbs() {
		return weightInLbs;
	}

	public void setWeightInLbs(double weightInLbs) {
		this.weightInLbs = weightInLbs;
	}

	public double getHeightInFt() {
		return heightInFt;
	}

	public void setHeightInFt(double heightInFt) {
		this.heightInFt = heightInFt;
	}

	public double getLengthInFt() {
		return lengthInFt;
	}

	public void setLengthInFt(double lengthInFt) {
		this.lengthInFt = lengthInFt;
	}

	public double getWidthInFt() {
		return widthInFt;
	}

	public void setWidthInFt(double widthInFt) {
		this.widthInFt = widthInFt;
	}

	public boolean isLocked() {
		return isLocked;
	}

	public void setLocked(boolean isLocked) {
		this.isLocked = isLocked;
	}

	public Treasure[] getContents() {
		if (isLocked) return null;
		return contents;
	}

	public void setContents(Treasure[] contents) {
		this.contents = contents;
		
	}

	public int checkNumberOfTreasures() {
		int numberOfTreasures = 0;
		for(Treasure treasure : contents) {
			if(treasure!=null)
				numberOfTreasures++;
		}
		return numberOfTreasures;
	}


	public TreasureChest() {
		this.weightInLbs = 50;
		this.heightInFt = 2;
		this.lengthInFt = 2;
		this.widthInFt = 3;
		this.isLocked = false;
		this.contents = new Treasure[5];
	}

	public TreasureChest(double weightInLbs, double heightInFt, double lengthInFt, 
			double widthInFt, boolean isLocked, Treasure[] contents) {
		this.weightInLbs = weightInLbs;
		this.heightInFt = heightInFt;
		this.lengthInFt = lengthInFt;
		this.widthInFt = widthInFt;
		this.isLocked = isLocked;
		this.contents = contents;
	}
	
	public String toString() {
		if (this.isLocked) {
		return String.format("The %.2fft tall, %.2fft long, %.2fft wide chest that weighs %.2flbs "
				+ "is locked. You cannot see its contents.", heightInFt, lengthInFt, widthInFt, 
				weightInLbs);
		}else if (!this.isLocked && checkNumberOfTreasures()>0){
			return String.format("The %.2fft tall, %.2fft long, %.2fft wide chest that weighs"
					+ " %.2flbs is open. It contains %s treasures.", heightInFt, lengthInFt, 
					widthInFt, weightInLbs, checkNumberOfTreasures());
		}else {
			return String.format("The %.2fft tall, %.2fft long, %.2fft wide chest that weighs"
					+ " %.2flbs is unlocked. Nothing rests inside.", heightInFt, lengthInFt, 
					widthInFt, weightInLbs);
		}
	}
	
	
    
    

}
