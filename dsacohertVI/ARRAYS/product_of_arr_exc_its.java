//https://leetcode.com/problems/product-of-array-except-self/description/
import java.util.*;

public class product_of_arr_exc_its {
    public static void main(String[] args) {

        // Yesterday obj = new obj();
        // obj.extract();
        Yesterday.extract();

        int[] nums = {5,6,3,2,1};
        int n = nums.length;
        int[] res = new int[n];
        int[] left = new int[n];
        int[] right = new int[n];

        int product = 1;
        for (int i = 0; i < n; i++) {
            product *= nums[i];
            left[i] = product;

        }

        product = 1;
        for (int i = n - 1; i >= 0; i--) {
            product *= nums[i];
            right[i] = product;

        }

        res[0] = right[1];
        res[n - 1] = left[n - 2];

        for (int i = 1; i < n - 1; i++) {
            res[i] = left[i - 1] * right[i + 1];
        }
        System.out.println(Arrays.toString(res));
    }

}


class Yesterday {
    static void extract(){
        String s = "fvv3riunb4 5ih g644 ihghig3";

        ArrayList<String> res = new ArrayList<>();
        StringBuilder num = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                num.append(ch);
            }

            else {
                if (num.length() > 0) {
                    res.add(num.toString());
                    num.setLength(0);
                }
            }
        }

        if (num.length() > 0) {
            res.add(num.toString());
        }

        System.out.println(res);
    }
}
