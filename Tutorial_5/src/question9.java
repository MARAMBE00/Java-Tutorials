import java.util.Arrays;
import java.util.Scanner;

public class question9 {

    public static void main(String[] args){

        //Reading the array from the user
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of the array you want to be created: ");
        int size = input.nextInt();

        int[] myArray = new int[size];

        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<size; i++){
            myArray[i] = input.nextInt();
        }

        //Reading the number
        System.out.println("Enter the sum: ");
        int num = input.nextInt();

        System.out.println("The array created is: " + Arrays.toString(myArray));
        System.out.println("Indices of the elements whose sum is: " + num);

        for(int i=0; i<myArray.length; i++){
            for (int j=i; j<myArray.length; j++){
                if((myArray[i]+myArray[j])== num && i!=j){
                    System.out.println(myArray[i]+", "+myArray[j]);
                }
            }
        }
    }
}