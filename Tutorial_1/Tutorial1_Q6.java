import java.util.Scanner;

public class Tutorial1_Q6{
	
	public static void main(String[] args){
		
		System.out.println("Calculate the volume of a box.");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the length of the box:");
		double length = input.nextDouble();
		
		System.out.println("Enter the height of the box:");
		double height = input.nextDouble();
		
		System.out.println("Enter the width of the box:");
		double width = input.nextDouble();
		 
		double volume = (length * height * width);
		System.out.println("The volume of a box is " + volume);
	}
}