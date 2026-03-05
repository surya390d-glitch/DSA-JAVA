import java.util.Scanner;
public class Calc {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.print("Enter your operation: ");
            char op = in.next().charAt(0);
            int ans = 0;
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                System.out.print("Enter the two numbers: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                if(op == '+') {
                    ans = num1 + num2;
                }
                if(op == '-') {
                    ans = num1 - num2;
                }
                if(op == '*') {
                    if(num2 != 0 || num1 != 0){
                        ans = num1 * num2;
                    }
                    else{
                        System.out.println("zero's are not allowed to multiply. ");
                    }   
                }
                if(op == '/') {
                    ans = num1 / num2;
                }
                if(op == '%') {
                    ans = num1 % num2;
                }
                System.out.println("result: " +ans);
            }
            else if(op == 'x' || op == 'X'){
                break;
            }
            else{
                System.out.println("invalid operation.try again.");
            }
        }
    }
}