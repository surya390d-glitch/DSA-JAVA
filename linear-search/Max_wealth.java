public class Max_wealth {
    public static void main(String[] args) {
        int[][] arr = { { 1, 3, 5 }, { 2, 4, 1 }, { 7, 2 , 23} };
        int ans = check_wealth(arr);
        System.out.println(ans);
    }

    static int check_wealth(int[][] num) {
        int ans = Integer.MIN_VALUE;
        // int sum = 0;
        for (int per = 0; per < num.length; per++) {
            int sum = 0;
            for (int acc = 0; acc < num[per].length; acc++) {
                sum += num[per][acc];
            }
            
            if (sum > ans) {
                ans = sum;
            }
        }
        // return sum;
        return ans;
    }
}
