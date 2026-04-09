import java.util.Scanner;
public class Find_max {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int a = in.nextInt();
        System.out.print("Enter num2: ");
        int b = in.nextInt();
        System.out.print("Enter num3: ");
        int c = in.nextInt();
        int max = Math.max(c,(Math.max(a,b)));
        System.out.println("max num is: "+max);
        in.close();
    }
}
