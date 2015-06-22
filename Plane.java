
public class Plane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int satPolijetanja = 4;
		int minutePolijetanja = 37;
		
		int satLetenja = 5;
		int minuteLetenja = 22;
		
		int vrijemeLetenja = satLetenja * 60 + minuteLetenja;
		
		int minuteSlijetanja = minutePolijetanja + vrijemeLetenja;
		int satSlijetanja = satPolijetanja + minuteSlijetanja / 60;
		minuteSlijetanja = minuteSlijetanja % 60;
		
		System.out.printf("Avion slijece u %02d:%02dh", satSlijetanja, minuteSlijetanja);			


	}

}
