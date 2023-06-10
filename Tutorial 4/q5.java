import java.util.Scanner;

public class q5{
	
    public static void main(String[]args){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int val = in.nextInt();
        int ans = 0;
        ans = factorial(val);
        System.out.print("Answer is " + ans);
    }

    public static int factorial(int num){
        int result =0;
        int total = num;
        for(int i = num-1; i>=1; i--){
            result = total * i;
            total = result;
        }
        return total;
    }
}