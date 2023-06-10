import java.util.Arrays;
import java.util.Scanner;

public class Question4 {

    void bubbleSort(int arr[]){

        int swap=0;
        int n = arr.length;

        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1]){
                    int temp = arr[j]; // swap arr[j+1] & arr[j]
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap += 1;
                }
        System.out.println("Number of swap " +swap);
    }

    void printArray(int arr[]){

        int n = arr.length;
        for (int i=0; i<n; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Question3 ob = new Question3();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter length of your array: ");
        int n = scan.nextInt();

        int arr[] = new int[n];

        for (int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }

        System.out.println("Entered array is " + Arrays.toString(arr));
        ob.bubbleSort(arr);

        System.out.println("Sorted array is ");
        ob.printArray(arr);
    }
}
