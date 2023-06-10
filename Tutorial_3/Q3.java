import java.util.Scanner;

public class Q3{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        System.out.print("Enter a letter: ");
        char letter = input.next().charAt(0);

        int count = 0;
        while(count < num){
            System.out.print(letter);
            count ++;
        }
    }
}