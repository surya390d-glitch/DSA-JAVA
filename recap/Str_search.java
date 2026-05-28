import java.util.*;
public class Str_search {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any name: ");
        String name = in.nextLine();
        System.out.print("Enter your target: ");
        char target = in.next().trim().charAt(0);
        boolean ans = search(name, target);
        System.out.println(ans);
    }
    
    static boolean search(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        
        // for (char ch : str.toCharArray()) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println(target + " = " + (int) target +" | " +str.charAt(i) + " = " + (int) str.charAt(i));

            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
