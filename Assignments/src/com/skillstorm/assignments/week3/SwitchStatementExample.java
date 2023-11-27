package com.skillstorm.assignments.week3;

public class SwitchStatementExample {

	public static void main(String[] args) {
		int today = 4;
		System.out.println(longIfStatement(today));
		System.out.println(switchExample(today));

	}
	
	public static String longIfStatement(int todayInput) {
		
		System.out.println("Here is the output of the if/else statement:");
		
		if (todayInput == 1){
			return "Sunday";
		}else if (todayInput == 2) {
			return "Monday";
		}else if (todayInput == 3) {
			return "Tuesday";
		}else if (todayInput == 4) {
			return "Wednesday";
		}else if (todayInput == 5) {
			return "Thursday";
		}else if (todayInput == 6) {
			return "Friday";
		}else if (todayInput == 7) {
			return "Saturday";
		}else {
			return "Invalid day entered";
		}
	}
	
	public static String switchExample(int todayInput) {
		
		System.out.println("Here is the output of the switch statement:");
		
		String switchDay = "";
		switch(todayInput) {
		case 1: switchDay = "Sunday";
		break;
		case 2: switchDay = "Monday";
		break;
		case 3: switchDay = "Tuesday";
		break;
		case 4: switchDay = "Wednesday";
		break;
		case 5: switchDay = "Thursday";
		break;
		case 6: switchDay = "Friday";
		break;
		case 7: switchDay = "Saturday";
		break;
		default: switchDay = "Invalid day entered";
		}
		return switchDay;
	}

}
