
public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int number = 358;
		
		int first = number / 100;
		int second = (number % 100) / 10;
		int third = number % 10;
		
		int divisor = first + second + third;
		
		if(number % divisor == 0){
			System.out.println("Broj je djeljiv: ");
		} else {
			System.out.println("Broj nije djeljiv: ");			
		}

	}

}