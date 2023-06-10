import java.util.Scanner;

class Q6{
    public static void main(String[] args) {

        int number, power, count;
        int total=0;

        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter number: ");
        number = input.nextInt();

        System.out.println("Enter power: ");
        power = input.nextInt();

        count=0;

        while ( count <= power )
        {
            total=(int) Math.pow(number, power);
            count+=1;
        }
        System.out.println("The answer is " + total);
        
    }
}

