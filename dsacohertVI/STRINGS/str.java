package STRINGS;
public class str {
    public static void main(String[] args) {
        String val = "  surya billgates   ";
                    //01234567890123456789
        for (int i = 0; i < val.length(); i++) {
            System.out.println(i + ":" + val.charAt(i));
        }
        System.out.println("character array: " + new String(val));
        // System.out.println(val.length());
        // System.out.println(val.charAt(10));
        // System.out.println(val.trim());
        // System.out.println(val.contains("s"));
        // System.out.println(val.startsWith(" "));
        // System.out.println(val.endsWith(" "));
        // System.out.println(val.indexOf("billgates"));
        // System.out.println(val.substring(3,9));//slice
        // System.out.println(val.replace("b", "m"));
        // System.out.println(val.toLowerCase());
        // System.out.println(val.toUpperCase());
//-------------------------------------------------------------------------------------------------------
        //String reverse with buildin method:
        // String rev = new StringBuilder(val).reverse().toString();
        // System.out.println((rev).toUpperCase().trim());

        //String reverse without buildin method
        // String R = "";
        // for (int i = val.length() - 1; i >= 0; i--) {
        //     R += val.charAt(i);
        // }
        // System.out.println(R.trim().toUpperCase());

        // StringBuilder obj = new StringBuilder();

        // for (int i = val.length() - 1; i >= 0; i--) {
        //     obj.append(val.charAt(i));
        // }
        // System.out.println(obj.toString());
//-------------------------------------------------------------------------------------------------------------
        //string comperision

        String str1 = "yatch";
        String str2 = "yatch";
        // if (str1.equals(str2.trim())) {
        //     System.out.println(true);

        // } else {
        //     System.out.println("false");
        // }

        //func call
        // boolean ans = isCheck(str1, str2);
        // System.out.println(ans);

        //ASCII Values
        // for (int i = 0; i < 200; i++) {
        //     System.out.print(i + ":" + (char) (i) + " ");
        // }
//------------------------------------------------------------------------------------------------
        String col = "cabfed";
        //convert string into char array
        char[] alpha = col.toCharArray();

        //sort the char array
        //Arrays.sort(alpha);

        //apply pubble sort
        int n = alpha.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (alpha[j] < alpha[j + 1]) {
                    //swap
                    char temp = alpha[j];
                    alpha[j] = alpha[j + 1];
                    alpha[j + 1] = temp;
                }
            }
        }

        //convert the sorted char array
        String sortedarr = new String(alpha);
        System.out.println(sortedarr);
//----------------------------------------------------------------------------------------
/// String Concatenate
System.out.println(str1 + " " + str2);
StringBuilder con = new StringBuilder();
con.append(str1).append(" ").append(str2);
System.out.println(con);
    }
        
    private static boolean isCheck(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        if (n != m) {
            return false;
        }
        for (int i = 0; i < n; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    }

