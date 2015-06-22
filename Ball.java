
public class Ball {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double poluprecnik = 1.25;
		
		double V = (4 / 3) * poluprecnik * poluprecnik * poluprecnik * Math.PI;
		
		double tolerancija = 6.014 * 0.05 / 100;
		
		if(V <= 6.014 - tolerancija && V <= 6.014 + tolerancija){
			System.out.println("Lopta je dobrog kvaliteta");
		} else {
			System.out.println("Lopta nije dobrog kvaliteta");			
		}		

	}

}
