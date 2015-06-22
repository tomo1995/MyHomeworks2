
public class Metoda5 {

	public static void main(String[] args) {
		System.out.println(getNumbersOnly("41d4 K. :9"));
	}
	
	public static String getNumbersOnly(String s) {
		String s1 = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 48 && s.charAt(i) <= 57) {
				s1 += s.charAt(i);
			}
		}
		return s1;
	}
}
