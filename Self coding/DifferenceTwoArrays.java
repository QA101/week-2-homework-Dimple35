
public class DifferenceTwoArrays {
	/*
	 * Write a program which takes as input two 1D- array and find the difference of two

	  array and store results in new array.
	 * 
	 */
	
		public static void main(String[] args) {
			
				int [] firstArray = {3,5,41,9,15,23,2,15,4,33};
				int [] secondArray = {1,8,3,4,5,43,7,8,9,10};
				int [] thirdArray = new int [10];	
					for (int i=0; i<10; i++) {
						thirdArray[i] = firstArray[i] - secondArray[i];
						 
					}
					for (int i=0; i<10; i++)
						System.out.print(thirdArray[i]+",");
					

					
				}
	}


