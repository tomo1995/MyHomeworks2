
public class Task1 {

	public static void main(String[] args) {
		double d =  convertToKelvins(100);
		System.out.println(d);
	}
	
	/**
	 * 
	 * @param d Represents temperature value in Celsius.
	 * @return Returns value in Kelvins.
	 */
	public static double convertToKelvins(double d){
		
		return d + 273.15;
		
	}
	
}
