import java.util.Scanner;

class Q7{
    public static void main(String[] args) {

        int number, count, factorial;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number: ");
        number=input.nextInt();

        count=0;
        factorial=1;
        
        while (count < number) {
            count++;
            factorial = factorial*count;
        }

        System.out.println("The factorial is " + factorial);
    }
}

