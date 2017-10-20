
public class MinOneD {
	// Write a program which takes as input 1D- array and finds minimum number
	public static void main(String[] args) {
		
			int min = 999;
			int [] minArray = {3,5,41,9,15,23,2,15,4,33};
				
				for (int i=0; i<10; i++) {
					
					if (minArray[i] < min) {
						min = minArray[i];
									    }
				}
				System.out.println("Minimum:"+min);
				

				
			}

}
