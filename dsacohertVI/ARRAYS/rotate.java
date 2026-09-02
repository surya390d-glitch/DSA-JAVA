import java.util.*;
public class rotate {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        k = k%nums.length; // k must be < arr length
        swap(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));//rotate entire array: [7, 6, 5, 4, 3, 2, 1]
    
        swap(nums,0, k - 1);
        System.out.println(Arrays.toString(nums));//rotate first k portion: [5, 6, 7, 4, 3, 2, 1]

        swap(nums, k, nums.length - 1);
        System.out.println(Arrays.toString(nums));//rotate remaining portion: [5, 6, 7, 1, 2, 3, 4]   
        
    }

    static void swap(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        start++;
        end--;
        }
        
    }
    
}
