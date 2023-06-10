import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class question7 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int[] myNamesArray = new int[10];

        for(int i=0; i<myNamesArray.length; i++){
            System.out.print("Enter a number: ");
            myNamesArray[i] = input.nextInt();
        }

        int [] myNamesArrayList = new int[10];

        System.arraycopy(myNamesArray, 0, myNamesArrayList, 0, myNamesArray.length);
        Arrays.sort(myNamesArrayList);
        for (int i = 0; i <10; i++){
            System.out.print(myNamesArrayList[i] + " ");
        }
    }
}
