package com.Sneha.misc;

public class SwitchDemo {

	public static void main(String[] args) {
		
		String inputday=args[0];
		System.out.println("Entered day : "+inputday);
		
		Days convertedInput=mappingDaysToEnum(inputday);
		System.out.println("Converted day : "+convertedInput);
		//Days entereddday= Days.SUNDAY;
		
		switch (convertedInput) {
		case MONDAY:
			/*System.out.println("Working day");
			break;*/
		case TUESDAY:
			System.out.println("Working day");
			break;
		case WEDNESDAY:
			System.out.println("Working day");
			break;
		case THRUSDAY:
			System.out.println("Working day");
			break;
		case FRIDAY:
			System.out.println("Working day");
			break;
		case SATURDAY:
			System.out.println("Holiday day");
			break;
		case SUNDAY:
			System.out.println("Holiday day");
			break;

		default:
			break;
		}
	}

	private static Days mappingDaysToEnum(String day) {
		
		/*if(day.equalsIgnoreCase("fri"))
			return Days.FRI;
		else if(day.equalsIgnoreCase("sat"))
			return Days.SAT;
		return null;*/
		
		Days days=Days.MONDAY;
		
		String dayAgain=day.toLowerCase();
		switch(dayAgain)
		{
		case "mon":
			days=Days.MONDAY;
			break;
		case "tue":
			days=Days.TUESDAY;
			break;
		case "wed":
			days=Days.WEDNESDAY;
			break;
		case "thrus":
			days=Days.THRUSDAY;
			break;
		case "fri":
			days=Days.FRIDAY;
			break;
		case "sat":
			days=Days.SATURDAY;
			break;
		case "sun":
			days=Days.SUNDAY;
			break;
		default:
			break;
		}
		return days;
	}
	

}

enum Days
{
	MONDAY,TUESDAY,WEDNESDAY,THRUSDAY,FRIDAY,SATURDAY,SUNDAY
}

