import java.util.Scanner;
class Ams{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        boolean ans = check(num);
        System.out.println(ans);

        for (int i = 0; i < 1000; i++) {
            if (check(i)) {
                System.out.println(i);
            }
        }
            
    }
    
    static boolean check(int num) {
        if (num < 0) {
            return false;
        }
        int sum = 0;
        int org = num;
        int digit = String.valueOf(num).length();
        while (num > 0) {
            int rem = num % 10;
            sum += (int) (Math.pow(rem,digit));
            num /= 10;
        }
        return sum == org;
    }
}