import java.util.Scanner;

public class Remembering 
{	
	public static void main(String[] args) 
	{
		int num = 0; 
		int test = 2;
		String end = "1, ";
		Scanner theKeys = new Scanner(System.in);
		
		while(true) {	
		
		test = 2;
		end = "1, ";
		System.out.println("Enter an integer: ");
		num = theKeys.nextInt();
			
		while(test + 1<num) {
			if((float)num/test==num/test) {
				end = end + test + ", ";
			}
			test = test + 1;
		}
		
		end = end + num;
		
		System.out.println("The number you entered was " + num + ".");
		System.out.println("Its factors are: " + end);
	
		
		}
	}
}