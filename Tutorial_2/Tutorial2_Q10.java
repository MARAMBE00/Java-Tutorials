import java.util.Scanner;

public class Tutorial2_Q10{

    public static void main(String[] args){

        int days = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a month: ");
        String month = input.nextLine().toLowerCase();

        switch(month){

            case "january": days = days + 31;
            case "february": days = days + 28;
            case "march": days = days + 31;
            case "april": days = days + 30;
            case "may": days = days + 31;
            case "june": days = days + 30;
            case "july": days = days + 31;
            case "august": days = days + 31;
            case "september": days = days + 30;
            case "october": days = days + 31;
            case "november": days = days + 30;
            case "december": days = days + 31;
            break;
            default : System.out.println("Invalid month");

        }

        System.out.println("We have " +days+ " days to end this year.");
    }
}