import java.util.Scanner;


public class Prethodna1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int num;
		num = in.nextInt();
		switch (num){
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Workday");
			break;
			
		case 6:
		case 7:
			System.out.println("Weekend");
			break;
			default:
				System.out.println("default");
		}
		
	}

}
