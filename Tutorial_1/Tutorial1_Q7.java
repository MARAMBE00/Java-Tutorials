import java.util.Scanner;

public class Tutorial1_Q7{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number in metres:");
		double metres = input.nextDouble();
		
		double centimetres = metres * 100;
		System.out.println(metres + " metres is equal to " + centimetres + " centimetres");
	}
}