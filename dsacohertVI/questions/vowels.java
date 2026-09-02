import java.util.*;
public class vowels {
    public static void main(String[] args) {
        String vow = "weuo ksjdcbcnecempav";
        StringBuilder v = new StringBuilder();
        ArrayList<String> ans = new ArrayList<>();
        for (char ch : vow.toCharArray()) {
            // if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            //     v.append(ch);
            // } else {
            //     if (vow.length() > 0) {
            //         ans.add(v.toString());
            //         v.setLength(0);
            //     }
            // }
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch+":"+" vowel");
            }
            else {
                System.out.println(ch +":" +"not vow");
            }
        }
        System.out.println(ans);
    }
}
