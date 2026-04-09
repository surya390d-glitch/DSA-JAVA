abstract class ATM {
    abstract void ValidatePin ();
    abstract void withdrawalMoney();
    void CheckBalance(){
        System.out.print("Balance is RS.10,000");  
    }
}
class SBIATM extends ATM {
    void ValidatePin(){
        System.out.println("PIN validate Successfully");
    }
    void withdrawalMoney(){
        System.out.println("Money Withdrawal Successfully");
    }
}
public class Main{
    public static void main (String [] args){
        ATM atm = new SBIATM();
        atm.ValidatePin();
        atm.withdrawalMoney();
        atm.CheckBalance();
        
    }
}
