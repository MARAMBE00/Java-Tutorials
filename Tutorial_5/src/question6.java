import java.util.Scanner;

public class question6 {
    public static void main(String[] args) {

        double[] myArray = {2.40, 3.69, 4.50, 12.80, 7.30, 11.12, 25.20, 41.80, 67.69, 48.10, 88.12, 9.50, 11.67, 91.60, 49.40,
                64.30, 31.90, 79.20, 96.60, 81.91};

        System.out.println("Original list:");
        for(int k=0; k<myArray.length; k++){
            System.out.print(myArray[k] + "  ");
        }

        System.out.println();

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the first index: ");
        int i = input.nextInt();
        System.out.print("Please enter the second index: ");
        int j = input.nextInt();

        swap(i,j);

    }
    public static void swap(int i , int j){
        double temp;
        double[] myArray = {2.40, 3.69, 4.50, 12.80, 7.30, 11.12, 25.20, 41.80, 67.69, 48.10, 88.12, 9.50, 11.67, 91.60, 49.40,
                64.30, 31.90, 79.20, 96.60, 81.91};

        temp = myArray[i-1];
        myArray[i-1] = myArray[j-1];
        myArray[j-1] = temp;

        for(int l=0; l<myArray.length; l++){
            System.out.print(myArray[l] + "  ");
        }
    }
}
