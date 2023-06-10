import java.util.Scanner;

public class q10{
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Value: ");
        int val = input.nextInt();
        int ans = 0;
        ans = palindrom(val);
        if (val == ans) {
            System.out.println("palindrome number");
        }
        else {
            System.out.println("not palindrome");
        }
    }

    public static int palindrom(int num){
        int x;
        int sum=0,temp;
        temp= num;
        while(num>0){
            x= num%10;  //getting remainder
            sum= (sum*10) + x;
            num= num/10;
        }
        return sum;
    }
}
	
			
			
		
		
		
		
