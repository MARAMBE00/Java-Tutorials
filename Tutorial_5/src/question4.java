import java.util.*;

public class question4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] arr1 = new int[5];
        int[] arr2 = new int [5];

        for (int x = 0; x <5 ; x++){
            System.out.print("Enter a number: ");
            arr1[x] = input.nextInt();
            arr2[x] = arr1[x];
        }

        int temp = arr1[4];

        for (int i = 0 ; i <5 ; i++){
            if (i!=4){
                arr1[i+1] = arr2[i];
            }
            else{
                break;
            }
        }

        arr1[0] = temp;

        for (int j =0;j <5;j++ ){
            System.out.print(arr1[j] + " ");
        }
    }
}
