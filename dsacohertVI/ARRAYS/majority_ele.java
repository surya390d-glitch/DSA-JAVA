//https://leetcode.com/problems/majority-element/description/

public class majority_ele {
    public static void main(String[] args) {
        int[] nums = { 3, 3, 1, 1, 1, 3, 3 };
        int ans = find(nums);
        System.out.println(ans);
    }

    static int find(int[] nums) {
        int major = 0;
        int count = 0;
        for (int num : nums) {
            if (count == 0) {
                major = num;
            }
            if (num == major) {
                count++;
            } else {
                count--;
            }
        }
        return major;
    }
}
