import java.util.Scanner;

public class Q8{

    public static int checkHappyNumber(int number){

        int rem = 0;
        int sum = 0;

        // calculate the sum of squares of each digit

        while (number > 0){
            rem = number % 10;
            sum = sum + (rem * rem);
            number = number / 10;
        }
        return sum;
    }

    public static void main(String[] args){

        //Take number from keyboard

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a non-zero positive number: ");
        int number = sc.nextInt();
        int result = number;

        while (result != 1 && result != 4){
            result = checkHappyNumber(result);
        }
        if(result == 1){
            System.out.println("It is a happy number");
        }
        else{
            System.out.println("It is not a happy number");
        }
    }
}