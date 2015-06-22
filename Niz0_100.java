
public class Niz0_100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int niz[] = new int[100];
		for(int i=0, k=0;i<100;i++){
			if(k<9){
				niz[i]=k;
				k++;
			}else{
				niz[i]=k;
				k=0;
			}			
		}
		for(int i=0;i<100;i++){
			System.out.println(niz[i] + " ");
		}
	}

}
