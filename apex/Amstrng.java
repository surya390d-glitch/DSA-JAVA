import java.util.Scanner;
class Amstrng {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        // int num = in.nextInt();
        // boolean isAns = check_Amstrng(num);
        // if (isAns) {
        //     System.out.print(num + " is Amstrong");
        // }
        // else{
        //     System.out.print(num + " is not Amstrong");
        // }
        for (int i = 0; i < 1000; i++){
            if (check_Amstrng(i)){
                System.out.println(i + "");
            }
        }
    }

    public static boolean check_Amstrng(int num) {
        int original = num;
        int sum = 0;
        int digits = String.valueOf(num).length(); // Count digits
        
        while (num > 0) {
            int rem = num % 10;
            // Use Math.pow but cast it to int because it returns a double
            sum = sum + (int)Math.pow(rem, digits); 
            num = num / 10;
        }
        
        return sum == original;
    }
}