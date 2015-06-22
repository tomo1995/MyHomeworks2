

import java.util.Scanner;
import java.util.Arrays;
	public class H5 {



			public static void main(String[] args) {

				Scanner input = new Scanner (System.in);
				System.out.print("Insert elements: ");
				int maxLength1 = input.nextInt();
				
				int [] numbers1 = new int [maxLength1];
						
				for (int i = 0; i < numbers1.length; i++){
					System.out.println("Insert value of element: ");
					numbers1[i] = input.nextInt();
				}
				
				System.out.print("Insert elementrs : ");
				int maxLength2 = input.nextInt();
				
				int [] numbers2 = new int [maxLength2];
						
				for (int i = 0; i < numbers2.length; i++){
					System.out.println("Insert value of element: ");
					numbers2[i] = input.nextInt();
				}
				
				System.out.println( areTheyTheSame(numbers1, numbers2));
				System.out.println(addMembersOfTwoArrays(numbers1, numbers2));
				System.out.println(addArray1ToArray2(numbers1, numbers2));
				
				input.close();
			}
			
			public static boolean areTheyTheSame (int [] array1, int [] array2){
				
				boolean same = true;
				for(int i = 0; i < array1.length; i++) {
					for(int j = 0; j < array2.length; j++) {
						if (array1[i] != array2[i]) {
							same = false;
						} 
					}
				}
				
				return same;
			
			}
			
			public static int[] addMembersOfTwoArrays (int[] array1, int[] array2) {		
				
				int l1 = array1.length;
				int l2 = array2.length;
				
				int[] arrayRes = null;
				
				if (l1 > l2) {
					arrayRes = new int[l1];
					array2 = Arrays.copyOf(array2, l1); 
					
					for(int i = 0; i < l1; i++) {
						arrayRes[i] = array1[i] + array2[i];
					}
					
				} else if(l1 < l2) {
					arrayRes = new int[l2];
					array1 = Arrays.copyOf(array1, l2); 
					
					for(int i = 0; i < l2; i++) {
						arrayRes[i] = array1[i] + array2[i];
					}
				} else {
					for(int i = 0; i < l1; i++) {
						arrayRes = new int[l1];
						arrayRes[i] = array1[i] + array2[i];
					}
				}
				return arrayRes;
			}
			
			
			public static String addArray1ToArray2 (int [] array1, int [] array2){
				int num1 = array1.length;
				int num2 = array2.length;
				int num3 = num1 + num2;
				int[] array3 = new int[num3];
				for (int i = 0; i < num1; i++){
					array3[i] = array1[i];
				}
				int counter = 0;
					for (int i = num1; i < num3; i++){
						array3[i] = array2[counter];
						counter++;
					}
				return Arrays.toString(array3);
			}
		}
		
	
