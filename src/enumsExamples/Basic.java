package enumsExamples;

public class Basic {
	enum Week {
		Monday, Tuesday, Wednesday, ThursDay, Friday, Saturday, Sunday
	}
	
	public static void main(String[] args) {
		Week week;
		week = Week.Monday;
		
		System.out.println(week);
		
		for (Week day : Week.values()) {
			System.out.println(day);
		}
	}
}
