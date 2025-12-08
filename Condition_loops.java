import java.util.Scanner;
public class Condition_loops {
    public static void main(String []args){
        /* ***IF CONDITION */
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your salry amount: ");
        int salary = in.nextInt();
        if (salary > 25000){
            salary = salary + 2800;
        }
        else if(salary > 30000){
            salary = salary + 4800;
        }
        else{
            salary += 1000;
        }
        System.out.println("salary status: "+ salary);
        in.close();
    }
}
