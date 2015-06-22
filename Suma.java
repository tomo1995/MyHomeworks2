
public class Suma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 2359;
		

		int first = num / 1000;
		int second = (num % 1000) / 100;
		int third = (num % 100) / 10;
		int forth = num % 10;
		
		int sum = first + second + third + forth;
		
		
		System.out.println( "Sum is: " + sum);
		

	}

}
