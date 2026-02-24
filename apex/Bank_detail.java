//-----------------------------------------------(Bank Account Simulation)------------------------------------------------------------------------
import java.util.Scanner;
public class Bank_detail {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Bank_Account obj = new Bank_Account("puttin",23,220000);
        obj.Display_ac();
    }
}
class Bank_Account {
    float account_num;
    double Balance = 0;
    String account_HolderName;
    Scanner in = new Scanner(System.in);

    Bank_Account(String account_HolderName, float account_num, double Balance) {
        this.account_HolderName = account_HolderName;
        this.account_num = account_num;
        this.Balance = Balance;
    }

    double Deposit() {
        String input = "Enter your deposit amount";
        System.out.print("Enter your Deposit Ammount: ");
        double Deposit_amount = in.nextInt();
        Balance += Deposit_amount;
        return Balance;
    }

    double Withdraw() {
        System.out.print("Enter Your Withdraw Amount: ");
        double withdraw_amount = in.nextInt();
        double ubdated_amount = Balance - withdraw_amount;
        return ubdated_amount;
    }

    void Display_ac() {
        System.out.println("Deposite Details: " + Deposit());
        System.out.println("Withdraw_Details: " + Withdraw());
        // System.out.println("Account_Details: " + Ac_Details());
    }
}