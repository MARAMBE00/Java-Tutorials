import java.util.ArrayList;
import java.util.Scanner;

public class question10 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        arrayInputs(numbers);
        System.out.println("\nNumbers before removing : ");
        System.out.println(numbers);
        System.out.println();

        removeBadPairs(numbers);
        System.out.println("\nNumbers after removing : ");
        System.out.println(numbers);
        System.out.println();

    }

    public static void arrayInputs(ArrayList <Integer> numbers) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("\nEnter 0 to quit. (Remember that also consider as added number)");
        for(int i = 0; i > -1; i ++) {
            int n;
            System.out.print("Enter the " + (i+1) + " number :- ");
            n = userInput.nextInt();
            numbers.add(n);
            if(n == 0)
                break;
        }
    }

    public static void removeBadPairs(ArrayList <Integer> numbers) {
        if(numbers.size() % 2 == 1)
            numbers.remove(numbers.size()-1);
        for(int i = 0; i <  numbers.size();) {
            if (i == numbers.size()-1)
                break;
            if(numbers.get(i) < numbers.get(i+1)) {
                numbers.remove(i);
                numbers.remove(i);
            }
            else {
                i = i + 2;
            }
        }
    }
}