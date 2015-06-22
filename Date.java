
public class Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int day1 = 29;
		int month1 = 11;
		int year1 = 2025; 
		int day2 =   23; 
		int month2 = 12;
		int year2 = 2025;

		
		if (day1 == day2 && month1 == month2 && year1 == year2) {
			System.out.println("Datumi su jednaki");
		} else if (year1 > year2) {
			System.out.printf("Datum : %d-%d-%d je prije datuma %d-%d-%d",
					day2, month2, year2, day1, month1, year1);
		} else if (month1 > month2) {
			System.out.printf("Datum : %d-%d-%d je prije datuma %d-%d-%d",
					day2, month2, year2, day1, month1, year1);
		} else if (day1 > day2) {
			System.out.printf("Datum : %d-%d-%d je prije datuma %d-%d-%d",
					day2, month2, year2, day1, month1, year1);
		} else {
			System.out.printf("Datum : %d-%d-%d je prije datuma %d-%d-%d",
					day1, month1, year1, day2, month2, year2);
		}
	}

}
