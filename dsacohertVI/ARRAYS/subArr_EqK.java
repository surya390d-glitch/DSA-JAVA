import java.util.*;
//https://leetcode.com/problems/subarray-sum-equals-k/description/

class subArr_EqK {
    public static void main(String[] args) {
        int[] arr = { 3,4,7,2,-3,1,4,2 };
        int k = 7;
        int n = arr.length;
        int presum = 0, count = 0;

        Map<Integer, Integer> freq = new HashMap<>();
        freq.put(0, 1);
        for (int i = 0; i < n; i++) {
            presum += arr[i];
            int diff = presum - k;
            if (freq.containsKey(diff)) {
                count += freq.get(diff);
            }

            freq.put(presum, freq.getOrDefault(presum, 0)+1);
        }
        System.out.println(count);
    }
}