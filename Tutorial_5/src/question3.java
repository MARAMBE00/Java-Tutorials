import java.util.Scanner;

public class question3 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        double[] nums = new double[5];

        for(int i=0; i<nums.length; i++) {
            System.out.print("Please enter a number: ");
            nums[i] = input.nextDouble();
        }

        double max = nums[0];

        for(int i=1; i<nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        System.out.println("The largest number is " + max);


    }
}
