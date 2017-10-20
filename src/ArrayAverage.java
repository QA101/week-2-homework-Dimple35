import java.util.Scanner;
public class ArrayAverage {

	public static void main(String[] args) {
		int arraySize;
		double average = 0;
		double sum = 0;
		//Creating a scanner to read input from console

		Scanner console = new Scanner(System.in);
		System.out.println("How many ints to average?");
		arraySize = console.nextInt();
		int [] nArray = new int[arraySize];
		for (int i=0; i<arraySize; i++) {
			nArray[i] = console.nextInt();
			sum +=nArray[i];
		}

		average = sum/arraySize;
		System.out.println(average);

		//Closing the scanner

		console.close();
	}

}
