
	import java.util.Scanner;
	public class MinTwoD {
		@SuppressWarnings("resource")

		public static void main(String[] args) {
			// Write a program which takes as input 1D- array and finds minimum number
				int min = 999;
				int [][] minArray = new int [3][3];
				Scanner console = new Scanner(System.in);
				System.out.println("Enter 9 numbers: ");
					for (int j=0; j<3; j++) {
					for (int i=0; i<3; i++) {
						minArray[j][i] = console.nextInt();
						if (minArray[j][i] < min) {
							min = minArray[j][i];
						
					    }
					}
					}
					System.out.println("Minimum:"+min);
					
	     }
	}


