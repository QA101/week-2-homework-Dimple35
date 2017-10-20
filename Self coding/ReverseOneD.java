//Write a program which takes as input 1D- array and reverse an array
public class ReverseOneD {
	public static void main(String[] args) {
		// Write a program which takes as input 1D- array and finds maximum number
			int rev = 9;
			int [] firstArray = {3,5,41,9,15,23,2,15,4,33};
			int [] secondArray = new int [10];	
				for (int i=0; i<10; i++) {
					secondArray[rev]=firstArray[i];
					rev--; 
				}
				firstArray = secondArray;
				for (int i=0; i<10; i++)
					System.out.print(firstArray[i]+",");
				

				
			}

}
