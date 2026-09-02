


//https://leetcode.com/problems/valid-palindrome/description/

public class poly {
    public static void main(String[] args) {
        String input = "A man, a plan, a canal: Panama";
        // String input = "amanaplanacanalpanama";
        // String name = "madam";
        // System.out.println("org str = "+input);

        // String ans = reverse(input);
        // System.out.println("rev str = "+ans);

        // if (input.equals(ans)) {
        //     System.out.println("polydrome");
        // }
        // else {
        //     System.out.println("not polyndrome");
        // }

//******************************************************************************************************* */
boolean ans = result();
System.out.println(ans);
        

    }

    static String reverse(String input) {
        char[] ch = input.toCharArray();
        StringBuilder res = new StringBuilder();
        for (int i = ch.length - 1; i >= 0; i--) {
            res.append(ch[i]);
        }
        return String.valueOf(res);
    }
    
    static boolean result() {
        String name = "madam";
        StringBuilder store = new StringBuilder();
        for (char i : name.toCharArray()) {
            if (Character.isLetter(i) || Character.isDigit(i)) {
                store.append(i) ;
            }
        }

        String temp = store.toString();
        int left = 0, right = temp.length() - 1;
        while (left < right) {
            if (temp.charAt(left) != temp.charAt(right)) {
                return false;
            }
        }

        return true;
    }
}
