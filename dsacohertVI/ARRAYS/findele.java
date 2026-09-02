public class findele {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 5, 4, 8, 9, 7 };
        int target = 5;
        int ans = find(nums, target);
        System.out.println(ans);

    }

    public static int find(int[] nums, int target) {
        if (nums.length == 0) {
            return -1;
        }
        int element = 0;
        for (int i = 0; i<nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
