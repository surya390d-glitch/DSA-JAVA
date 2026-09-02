


//https://leetcode.com/problems/reverse-words-in-a-string/submissions/2125879408/
public class rev_word {
    public static void main(String[] args) {
        String input = "  the sky is blue";
                    //  01234567890123456
        System.out.println(check(input));            
    }
    
    static String check(String input) {
        StringBuilder res = new StringBuilder();
        int len = input.length();
        int i = 0;
        while (i < len) {
            //Search the first non space character
            while (i < len && input.charAt(i) == ' ')
                i++;
            if (i >= len)
                break;

            int j = i + 1;
            while (j < len && input.charAt(j) != ' ')
                j++;

            String sub = input.substring(i, j);
            if (res.length() == 0) {
                res.append(sub);
            } else {
                res.insert(0, sub + " ");
            }

            i = j;

        }
        return res.toString();
    }
}
