import java.util.Scanner;

public class q4{
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int value1 = input.nextInt();
        int total;

        total = multiply(value1);
        System.out.print(total);
    }
	
    private static int multiply(int value){
        return value*value;
    }
}
		
		