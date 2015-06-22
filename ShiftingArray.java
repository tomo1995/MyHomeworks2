
public class ShiftingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char niz[] = new char[]{'a', 'b', 'c', 'd', 'f'};
		
		for(int i=4;i>2;i--){
			niz[2+i]=niz[i];
			System.out.println(niz[i]);
		}
	}

}
