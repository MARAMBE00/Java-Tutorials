import java.util.Scanner;

public class Tutorial1_Q8{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the value in Centigrade:");
		double Centigrade = input.nextDouble();
		
		double Fahrenheit = (9.0 / 5) * Centigrade + 32;
		System.out.println(Centigrade + " Centigrade is equal to " + Fahrenheit + " Fahrenheit");
	}
}