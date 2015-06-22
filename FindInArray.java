import java.util.Scanner;


public class FindInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		boolean found = false;
		
		System.out.println("Unesite broj clanova niza");
		int num = in.nextInt();
		int niz[]=new int[num];
		
		System.out.println("Unesite elemente niza");
		for(int i = 0; i < num; i++){
			niz[i]=in.nextInt();
		}
		System.out.println("Unesite trazeni element");
		int Q = in.nextInt();
		in.close();
		
		for(int i = 0; i < num; i++){
			if(niz[i]==Q){
				found = true;
			}
		}
		
		if(found){
			System.out.println("true");
		} else{
			System.out.println("false");
		}
	}

}
