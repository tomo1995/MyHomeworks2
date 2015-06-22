package novo;

public class Arguments {

	public static void main(String[] args) {
		int[] numbers = new int[100];
		int i = 0, min;
		boolean f = true;
		for(String s : args){
			try{
				numbers[i] = Integer.parseInt(s);
				i++;
			} catch(NumberFormatException e){
				System.out.println("Please enter only numbers");
				f = false;
			}
		}
		min = numbers[0];
		for(int j = 0; j<i; j++){
			if(numbers[j]<min){ 
				min = numbers[j];
			}
		}
		if(f){
			System.out.println("Min. number is " + min);
		}
		
	}

}
