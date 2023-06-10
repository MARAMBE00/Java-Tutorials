import java.util.Scanner;

public class Tutorial1_Q10{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number of Manual people:");
		int manual = input.nextInt();
		
		System.out.println("Enter a number of Skilled people:");
		int skilled = input.nextInt();
		
		System.out.println("Enter a number of Management people:");
		int management = input.nextInt();
		
		int wageBill = (manual*500) + (skilled*700) + (management*800);
		int tax = wageBill * 20 / 100;

		System.out.println("Weekly wage bill is " + wageBill + " euros.");
		System.out.println("Approximate tax is " + tax + " euros.");
		
	}
}