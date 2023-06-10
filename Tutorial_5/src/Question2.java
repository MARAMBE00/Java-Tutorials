import java.util.Scanner;

public class Question2 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int[] marks = new int[10];

        for(int i=0; i<marks.length; i++){
            System.out.print("Enter your marks: ");
            marks[i] = input.nextInt();
        }


        for(int i=0; i< marks.length; i++){
            marks[i] = (int) Math.round(marks[i] * 0.9);
            System.out.print(marks[i] + " ");
        }

    }

}
