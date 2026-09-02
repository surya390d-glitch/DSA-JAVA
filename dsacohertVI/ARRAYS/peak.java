public class peak {
    public static void main(String[] args) {
        int[] nums = { 1, 7, 1, 3, 5, 6, 4 };
        int ans = peak_ele(nums);
        System.out.println(ans);
    }

    public static int peak_ele(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return -1;
        }
        int maxindex = 0;
        int maxelement = nums[0];
        for (int i = 0; i < n; i++) {
            if (nums[i] > maxelement) {
                maxelement = nums[i];
                maxindex = i;
            }
        }
        return maxindex;
    }
}
