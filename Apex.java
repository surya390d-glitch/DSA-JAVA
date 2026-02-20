
import java.util.Scanner;

class Apex {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 2, 3, 5, 4, 5 };
//----------------------------------------(non-repeating)--------------------------------------------------------------------------------
        // boolean ans = check(arr);
        // System.out.println(ans);
        // check(arr);
//------------------------------------------(Student Grade Calculation)----------------------------------------------------------------------------------------------
        // Student s = new Student("ayon", 56, 78, 90);
        // s.display_Grade();
//-------------------------------------------(Perimeter)----------------------------------------------------------------------------------------------        
        // rectangle r1 = new rectangle (12,45);
        // r1.display();
//--------------------------------------------------(Bank Account Simulation)---------------------------------------------------------------------------------------
        // Bank_Account ac = new Bank_Account("Rock Feller",142323,10000);
        // ac.Display_ac();
//---------------------------------------------------------------------------------------------------------------------------
// Employee emp = new Employee("rockfeller", 23, 50000);
// emp.calculate_bonus();
//-------------------------------------------------------------------------------------------------------------------------
// circle find = new circle(23);
// find.Display_ans();
//--------------------------------------------------------------------------------------------------------------------------
student obj = new student(23,98);
obj.displayStudentDetails();
Person p1 = new Person("Surya", 52);


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
//-------------------------------------------------(Student Grade Calculation)---------------------------------------------------------------------
/*2. Student Grade Calculation
Question:
Create a class Student with attributes name, marks1, marks2, marks3. Write methods to:
calculate total
calculate average
display grade based on average
*/
class Stud {
    String name;
    int marks1, marks2, marks3;

    Stud(String name, int marks1, int marks2, int marks3) {
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
        double ubdated_amount = Balance - withdraw_amount;
        return ubdated_amount;
    }

    void Display_ac() {
        System.out.println("Deposite Details: " + Deposit());
        System.out.println("Withdraw_Details: " + Withdraw());
        // System.out.println("Account_Details: " + Ac_Details());
    }
}
//---------------------------------------------------(Employee Salary with BonusQuestion)-----------------------------------------------------------------------------------------
/*4.Employee Salary with BonusQuestion:
Create a class Employee with empId, name, salary. Create a method to calculate bonus:

If salary > 50,000, bonus = 10%

Else bonus = 5%

Print final salary (salary + bonus).
 */

class Employee {
    int empId, salary;
    String name;

    Employee(String name, int empId, int salary) {
        this.name = name;
        this.empId = empId;
        this.salary = salary;
    }

    void calculate_bonus() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Id: " + empId);
        System.out.println("Employee Salary: " + salary);
        if (salary >= 50000) {
            double Bonus = (salary * 0.10);
            System.out.println("Bonus 10% added: " + (Bonus + salary));
        } else {
            double Bonus = (salary * 0.05);
            System.out.println("Bonus 5% added: " + (Bonus + salary));
        }
    }
}

//---------------------------------------------------------------------------------------------------------------------------
/*5. Create a Circle ClassQuestion:
Create a class Circle with radius. Write methods to find:

area

circumference

Use Math.PI.*/
class circle {
    double r;

    circle(double r) {
        this.r = r;
    }

    double Area() {
        double ans = (Math.PI * r * r);
        return ans;
    }

    double Circumference() {
        double ans = (2 * Math.PI * r);
        return ans;
    }

    void Display_ans() {
        System.out.println("Circumference: " + Circumference());
        System.out.println("Area: " + Area());
    }
}
//-------------------------------------------------------------------------------------------------------------------------------------------

class Person {
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age ;
    }

    void Display_PersonDetails() {
        System.out.println("Person Name: " + name);
        System.out.println("Person age: " + age);
    }
}

class student extends Person {
    int rollno;
    int mark;

    student(int rollno, int mark) {
        this.rollno = rollno;
        this.mark = mark;
    }

    void displayStudentDetails() {
        System.out.println("Student rollno: " + rollno);
        System.out.println("Student marks: " + mark);
        }

    
}




