
public class MaxOneD {
		public static void main(String[] args) {
		// Write a program which takes as input 1D- array and finds maximum number
			int max = 0;
			int [] maxArray = {3,5,41,9,15,23,2,15,4,33};
				
				for (int i=0; i<10; i++) {
					
					if (maxArray[i] > max) {
						max = maxArray[i];
					
				    }
				}
				System.out.println("Maximum:"+max);
				

				
			}

		

	}









