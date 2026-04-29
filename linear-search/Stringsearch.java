//package DSA-JAVA.linear-search;

public class Stringsearch {
    public static void main(String[] args) {
        String name = "arise";
        char target = 'i';
        int ans = check(name, target);
        System.out.println(ans);
    }

    static int check(String str, char target) {
        if (str.length() == 0) {
            return -1;
        }
        for (int i = 0; i <= str.length(); i++) {
            if (str.charAt(i) == target) {
                return i;
            }
        }
        return-1;
    }
}
