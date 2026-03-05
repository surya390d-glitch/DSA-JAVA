import java.util.*;
public class Power {
    public static void man(String[] args) {
        Scanner in = new Scanner(System.in);
        int range = in.nextInt();
        power(range);
    }

    static void power(int range){
        for (int i = 0; i <= range; i++) {
            System.out.println((int) Math.pow(2, i) + " ");
        }
    }
    
}
