import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        showMenu();
        readInput();
    }

    public static void showMenu(){

        System.out.println("~~~~~ Calculator Menu ~~~~~");
        System.out.println("Addition        : 1");
        System.out.println("Subtraction     : 2");
        System.out.println("Multiplication  : 3");
        System.out.println("Division        : 4");
        System.out.println("Square Root     : 5");
    }

    public static void readInput(){
        Calculator calc = new Calculator();
        ScientificsCalculator scCal = new ScientificsCalculator();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your selection: ");
        int selection = input.nextInt();
        if (selection == 1 || selection == 2 || selection == 3 || selection == 4){
            Scanner num1 = new Scanner(System.in);
            System.out.println("Enter first number: ");
            int input1 = num1.nextInt();

            Scanner num2 = new Scanner(System.in);
            System.out.println("Enter second number: ");
            int input2 = num2.nextInt();

            switch (selection){
                case 1:
                    DisplayResult(calc.addition(input1,input2));
                    break;
                case 2:
                    DisplayResult(calc.subtraction(input1,input2));
                    break;
                case 3:
                    DisplayResult(calc.multiplication(input1,input2));
                    break;
                case 4:
                    DisplayResult(calc.division(input1,input2));
                    break;
            }
        }
        else if(selection == 5){
            Scanner num = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int SQRoot = num.nextInt();
           // DisplayResult(calc.----(SQRoot));
        }
    }

    public static void DisplayResult(int answer){
        System.out.println();
    }
}
