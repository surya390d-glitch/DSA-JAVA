import java.util.*;

public class extractind {
    public static void main(String[] args) {
        String s = "1: Geeks for geeks, 2: geeksfor geeks, 3: forGeeksgeeks 56";
        System.out.println(extract(s));
    }

    public static ArrayList<String> extract(String s) {
        ArrayList <String> result = new ArrayList<>();
        StringBuilder nums = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                nums.append(ch);
            } else {
                if (nums.length() > 0) {
                    result.add(nums.toString());
                    nums.setLength(0);
                }
            }
        }

        if (nums.length() > 0)

        {
            result.add(nums.toString());
        } else {
            result.add("No Integer");
        }
        return result;
    }
}

/*                String
                  ↓
        Read one character
                  ↓
          Is it a digit?
             /        \
           YES        NO
            ↓          ↓
       Add to nums   Is nums empty?
                        /     \
                      NO       YES
                      ↓         ↓
                 Add nums     Do nothing
                 to result
                      ↓
                 Clear nums
                      ↓
               Read next character           */