import java.util.Scanner;
class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        

        if (num <= 0) {
            System.out.println("not prime");
            return;
        }
        boolean isprime = true;
        int count = 2;
        while (count * count <= num) {
            if (num % count == 0) {
                isprime = false;
                break;
            }
            count++;
        }
        if (count * count >= num) {
            System.out.println("prime");
        }
        else {
            System.out.println("not prime");
        }

    }
}