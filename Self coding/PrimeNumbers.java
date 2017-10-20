
public class PrimeNumbers {
	/*
	 * Prime numbers < 25
	 */
	
		public static void main(String[] args) {
				int prime = 0;
				int [] firstArray = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
					System.out.print("PRIME NUMBERS:");
					for (int i=1; i<25; i++) {
						prime = 0;
						for (int j=1; j<i; j++) {
							if (firstArray[i] % firstArray[j] == 0) {
							prime = 1;
							}
						}
							if (prime == 0) {
								System.out.print(firstArray[i]+",");
															}
					}
						 
		}
					
					
					
	}

