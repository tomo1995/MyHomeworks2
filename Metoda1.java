
public class Metoda1 {

	public static void main(String[] args) {
		
		System.out.println(getMin2(2, 3));
		System.out.println(getMin3(5, 43, 7));	
			
			
		
	}
	public static int getMin2(int a, int b){
		if (a > b) {
			return b;
		} else{
			return a;
		}
	}
	public static int getMin3(int a, int b, int c) {
		int ab = getMin2(a,b);
		if (ab > c){
			return c;
		}else{
			return ab;
		}
	}
	
}
