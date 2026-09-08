public class rev_let {
    public static void main(String[] args) {
        String s = "a-bC-dEf-ghIj";
        char[] ch = s.toCharArray();
        int i = 0;
        int j = ch.length - 1;
        while (i < j) {
            if (Character.isLetter(ch[i])) {
                if (Character.isLetter(ch[j])) {
                    //swap
                    char temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                }
                j--;
            }
            i++;
        }
        System.out.println(String.valueOf(ch));
    }
}
