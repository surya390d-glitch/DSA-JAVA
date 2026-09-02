




//https://leetcode.com/problems/capitalize-the-title/description/


public class capitalize {
    public static void main(String[] args) {
        String s = "capiTalIze tHe titLe is jaVa";
        char[] ch = s.toCharArray();
        int n = ch.length-1;

        for (int i = 0; i < n; i++) {
            int findex = i;
            while (i < n && ch[i] != ' ') {
                ch[i] = Character.toLowerCase(ch[i]);
                i++;
            }

            if (i - findex > 2) {
                ch[findex] = Character.toUpperCase(ch[findex]);
            }
        }
        System.out.println(String.valueOf(ch));
    }
}
