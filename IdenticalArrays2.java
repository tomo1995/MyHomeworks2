import java.util.Scanner;


public class IdenticalArrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int niz1[]=new int[5], niz2[]=new int[5];
		boolean identical = true;
		
		System.out.println("Unesite elemente prvog niza");
		for(int i=0;i<5;i++){
			niz1[i]=in.nextInt();
		}
		System.out.println("Unesite elemente drugog niza");
		for(int i=0;i<5;i++){
			niz2[i]=in.nextInt();
		}
		in.close();
		for(int i=0;i<5;i++){
			if(identical == true){
				for(int j=0;j<5;j++){
					if(niz1[i]==niz2[j]){
						identical = true;
						break;
					}else{
						identical = false;
					}
				}
			}
		}
		if(identical){
			System.out.println("Arrays are identical");
		} else{
			System.out.println("Arrays are not identical");
		}
	}

}
