import java.util.Scanner;

public class Tutorial2_Q1{
	
public static void main(String[] args){
	
		int normalTemperature = 37;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the temperature value: ");
		int temperature = input.nextInt();
		
		if(normalTemperature <= temperature){
			System.out.println("Hot");
		}
		else if(normalTemperature > temperature){
			System.out.println("Cold");
		}
	}
}