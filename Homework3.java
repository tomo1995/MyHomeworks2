
public class Homework3 {

	public static void main(String[] args) {
		IspisiNaEkran(4, 7);
	}
	
	public static void IspisiNaEkran(int a, int b){
		System.out.println("Zbir je " + Saberi(a, b));		
	}
	public static int Saberi(int a, int b){
		return a+b;		
	}
}
