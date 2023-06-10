import java.util.Scanner;

public class Question1 {

    public static void main(String[] args){

        int count = 0;

        Scanner input = new Scanner(System.in);

        int[] marks = new int[10];

        for(int i=0; i<marks.length; i++){
            System.out.print("Please enter your marks: ");
            marks[i] = input.nextInt();

            if(marks[i] < 40){
                count += 1;
            }
        }
        System.out.println(count + " number of students are failed.");
    }
}
