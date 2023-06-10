import java.util.Scanner;

public class Q2{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

            System.out.print("Enter your first number: ");
            int num_1 = input.nextInt();

            System.out.print("Enter your second number: ");
            int num_2 = input.nextInt();

            int min = Math.min(num_1, num_2);
            int max = Math.max(num_1, num_2);

            if(num_1 < num_2) {
                for (int i = min; i <= max; i++)
                    System.out.println(i);
            }
            else{
                System.out.println("Please enter a second number larger than the first number.");
            }
    }
}