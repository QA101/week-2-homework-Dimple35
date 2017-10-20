import java.util.Scanner;

public class mimicSignIn2 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				String [] userArray = {"Eric", "Kate", "John"};
				String [] pswdArray = {"cat", "bunny", "rose"};
				String [] emailArray = {"Eric@yahoo.com", "Kate@gmail.com", "John@hotmail.com"};
				String userName ="";
				String password ="";
				int try1 = 1;
				
				
				Scanner console = new Scanner(System.in);
				while(try1 != 0) {
				System.out.println("User name:");
				
				userName = console.nextLine();
				userName.replace(" ","");
				
				System.out.println("Password:");
				password = console.nextLine();
				password.replace(" ","");
				
				for (int i=0; i<3; i++) {
					
					if (userName.equals(userArray[i]) && password.equals(pswdArray[i])) {
						System.out.println("Email:"+emailArray[i]);
						return;
				    }
					else {
						if (i==2) {
						System.out.println("Invalid User/Pswd, try again");
						try1++;
						}
					}
				}
				}
				
				//Closing the scanner

				console.close();
			}

		

	}


