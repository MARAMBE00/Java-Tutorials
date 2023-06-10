import java.util.Scanner;

public class AccountTest {

    public static void main(String[] args) {

        String holderName;
        int accountNumber;
        String accountType;
        double currentBalance;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Account Holder's Name: ");
        holderName = scanner.nextLine();

        System.out.println("Enter Account Number: ");
        accountNumber = scanner.nextInt();

        System.out.println("Enter Initial Balance: ");
        currentBalance = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Enter Account Type: ");
        accountType = scanner.nextLine();

        System.out.println();
        System.out.println("Account Created");
        System.out.println();

        Account account = new Account(holderName, accountNumber, accountType, currentBalance);
        while (true){

            System.out.println("To Withdraw Money        : Press 1");
            System.out.println("To Deposit Money         : Press 2");
            System.out.println("To Check Balance         : Press 3");
            System.out.println("To View Account Details  : Press 4");
            System.out.println("To Exit                  : Press 5");

            int input = scanner.nextInt();

            switch (input){
                case 1:
                    System.out.println("Enter the Amount you want to Withdraw: ");
                    account.withdrawMoney(scanner.nextDouble());
                    break;
                case 2:
                    System.out.println("Enter the Amount you want to Deposit: ");
                    account.depositMoney(scanner.nextDouble());
                    break;
                case 3:
                    System.out.println("Current Account Balance is: " + account.checkBalance());
                    break;
                case 4:
                    account.displayAccountDetails();
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }
}