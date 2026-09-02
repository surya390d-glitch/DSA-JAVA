

//https://leetcode.com/problems/string-compression/description/

public class compress {
    public static void main(String[] args) {
        char[] ch = { 'a', 'a', 'b', 'b', 'b', 'b', 'c', 'c', 'd' };
        StringBuilder res = new StringBuilder();
        int i = 0;
        
        while (i < ch.length) {
            char current = ch[i];
            int count = 0;
            while (i < ch.length && ch[i] == current) {
                count++;
                i++;
            }
            if (count > 1) {
                res.append(current).append(count);
            }
            else {
                res.append(current);
            }
            
        }
        System.out.println(res.toString());

    }
}
