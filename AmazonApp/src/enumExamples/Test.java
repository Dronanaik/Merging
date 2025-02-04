package enumExamples;

public class Test {

	public static void main(String[] args) {
		
		Day day = Day.FRIDAY;
		switch(day)
		{
		case MONDAY:
			System.out.println("Working Day!");
			break;
		case TUESDAY:
			System.out.println("2nd Working Day!");
			break;
		case WEDNESDAY:
			System.out.println("Mid week");
			break;
		case THURSDAY:
			System.out.println("Closer to weekend");
			break;
		case FRIDAY:
			System.out.println("Weekend starts!");
			break;
		case SATURDAY:
			System.out.println("Yahoo weekend Day!");
			break;
		case SUNDAY:
			System.out.println("Yahoo weekend Day!");
			break;
		}
		
//		Day day1 = Day.FRIDAY;
//		System.out.println(day1);
		for (Day day1:Day.values()) {
			System.out.println(day1);
		}
//		Day[] day2 = Day.values();
//		for (int i=5;i<=6;i++) {
//			System.out.println(day2[i]);
//		}
	}

}
