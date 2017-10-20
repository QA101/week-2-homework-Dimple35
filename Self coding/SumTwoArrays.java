/*
 * Write a program which takes as input two 1D- array and find the sum of two

  array and store results in new array.
 * 
 */
public class SumTwoArrays {
	public static void main(String[] args) {
		// Write a program which takes as input 1D- array and finds maximum number
			
			int [] firstArray = {3,5,41,9,15,23,2,15,4,33};
			int [] secondArray = {1,2,3,4,5,6,7,8,9,10};
			int [] thirdArray = new int [10];	
				for (int i=0; i<10; i++) {
					thirdArray[i] = secondArray[i] + firstArray[i];
					 
				}
				for (int i=0; i<10; i++)
					System.out.print(thirdArray[i]+",");
				

				
			}
}
