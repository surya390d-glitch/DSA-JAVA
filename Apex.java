
import java.util.Scanner;

class Apex {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 2, 3, 5, 4, 5 };
        // boolean ans = check(arr);
        // System.out.println(ans);
        // check(arr);
//----------------------------------------------------------------------------------------------------------------------------------------
        // Student s = new Student("ayon", 56, 78, 90);
        // s.display_Grade();
//-----------------------------------------------------------------------------------------------------------------------------------------        
        rectangle r1 = new rectangle (12,45);
        r1.display();
//-----------------------------------------------------------------------------------------------------------------------------------------
        Bank_Account ac = new Bank_Account("Rock Feller",142323,10000);
        ac.Display_ac();
    }

    //----------------------------------------------(non-repeating)----------------------------------------------------------------------------------
    /*1. Find the first non-repeating element
    Input: {2, 3, 4, 2, 3, 5, 4}*/
    static void check(int[] arr) {
        for (int i = 0; i < arr.length; i++) {//2 ------> pick the one element
            int count = 0;
            for (int j = 0; j < arr.length; j++) {//2,3,4,2,3,5,4 ------->compares with outer loop
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println("ans" + arr[i]);
            }

        }
        // return false;
    }
}
//-------------------------------------------------()---------------------------------------------------------------------
/*2. Student Grade Calculation
Question:
Create a class Student with attributes name, marks1, marks2, marks3. Write methods to:
calculate total
calculate average
display grade based on average
*/
class Student {
    String name;
    int marks1, marks2, marks3;

    Student(String name, int marks1, int marks2, int marks3) {
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    int calculate_Total() {
        return marks1 + marks2 + marks3;
    }

    double calc_Avg() {
        return calculate_Total() / 3.0;
    }

    void display_Grade() {
        double avg = calc_Avg();
        System.out.print("name: " + name);
        System.out.print("\ntotal marks : " + calculate_Total());
        System.out.print("\naverage mars:  " + avg);

        if (avg >= 90) {
            System.out.print("grade A");
        } else if (avg >= 75) {
            System.out.print("\ngrade B");
        } else if (avg >= 50) {
            System.out.print("\ngrade c");
        }

        else {
            System.out.println("\nFail");
        }

    }

}

//-----------------------------------------(Perimeter)------------------------------------------------------------------------------------------


class rectangle {
    int length;
    int breadth;

    rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    int calculate_area() {
        return length * breadth;
    }

    int calculate_perimeter() {
        return 2 * (length + breadth);
    }

    void display() {
        System.out.println("Area: " + calculate_area() + " m^2");
        System.out.println("Perimeter: " + calculate_perimeter() + " Cm");
    }
}

//-----------------------------------------------(Bank Account Simulation)------------------------------------------------------------------------

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
            double ubdated_amount =  Balance-withdraw_amount ;
            return ubdated_amount;
        }

        void Display_ac() {
            System.out.println("Deposite Details: " + Deposit());
            System.out.println("Withdraw_Details: " + Withdraw());
            // System.out.println("Account_Details: " + Ac_Details());
        }
}
