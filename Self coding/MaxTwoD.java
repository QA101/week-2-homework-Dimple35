import java.util.Scanner;
public class MaxTwoD {
	@SuppressWarnings("resource")

	public static void main(String[] args) {
		// Write a program which takes as input 1D- array and finds maximum number
			int max = 0;
			int [][] maxArray = new int [3][3];
			Scanner console = new Scanner(System.in);
			System.out.println("Enter 9 numbers: ");
				for (int j=0; j<3; j++) {
				for (int i=0; i<3; i++) {
					maxArray[j][i] = console.nextInt();
					if (maxArray[j][i] > max) {
						max = maxArray[j][i];
					
				    }
				}
				}
				System.out.println("Maximum:"+max);
				
     }
}
