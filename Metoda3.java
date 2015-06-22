
public class Metoda3 {

	public static void main(String[] args) {
		System.out.println(hasNumbers("T0m15lav"));
	}
	

	public static boolean hasNumbers(String s) {
		int counter = 0;
		
		for(int i=0; i < s.length() - 1; i++) {
			if(s.charAt(i) > 47 && s.charAt(i) < 58)
				counter++;
		} if(counter > 0)
			return true;
		else
			return false;
}
}