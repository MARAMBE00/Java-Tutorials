public class Account {

    private String holderName;
    private int accountNumber;
    private String accountType;
    private double currentBalance;

    //constructor
    public Account(String holderName, int accountNumber, String accountType, double currentBalance){
        this.holderName = holderName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.currentBalance = currentBalance;
    }

    //getter
    public String getHolderName(){
        return this.holderName;
    }

    //setter
    public void setHolderName(String name){
        this.holderName = name;
    }

    public void depositMoney(double amount) {
        this.currentBalance = this.currentBalance + amount;
    }

    public void withdrawMoney(double amount){
        this.currentBalance -= amount;
    }

    public void displayAccountDetails(){
        System.out.println("Account Holder's Name: " + this.holderName);
        System.out.println("Account type: " + this.accountType);
        System.out.println("Account number: " + this.accountNumber);
    }

    public double checkBalance(){
        return this.currentBalance;
    }
}
