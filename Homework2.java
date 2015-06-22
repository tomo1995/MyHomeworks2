
public class Homework2 {

	public static void main(String[] args) {
		int num = 23;
		int counter = 1;
		int sum = 0;
		
		while ( counter < num ){
			if (counter % 2 == 0){
				sum = sum + counter;
			}
			counter ++;
		}
System.out.println("Sum of even numbers is " + sum );
	}

}
