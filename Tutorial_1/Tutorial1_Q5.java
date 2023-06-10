import java.util.Scanner;

public class Tutorial1_Q5{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your exam marks:");
		double mark1 = input.nextDouble();
		
		System.out.println("Enter your exam marks:");
		double mark2 = input.nextDouble();
		
		System.out.println("Enter your exam marks:");
		double mark3 = input.nextDouble();
		
		double average = (mark1 + mark2 + mark3) / 3;
		System.out.println("Your average mark is " + average);
	}
}