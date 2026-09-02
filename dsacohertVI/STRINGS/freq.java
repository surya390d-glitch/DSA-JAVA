package STRINGS;
import java.util.*;
public class freq {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = "billgates lol ";
        System.out.print("Enter the character: ");
        char ch = in.next().charAt(0);
        // char ch = ' ';

        int count = 0;

        for (char element : n.toCharArray()) {
            if (element == ch) {
                count++;
            }
        }
        System.out.println(count);
    }
    
}
