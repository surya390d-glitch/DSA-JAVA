import java.util.*;

//https://leetcode.com/problems/non-overlapping-intervals/description/

class non_overlap {
    public static void main(String[] args) {
        int[][] intervals = { {1,2}, {2,3}, {3,4}, {1,3} };
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[]a,int[]b) {
                return a[1] - b[1];
            }
        });
        int end = -100000;
        int remove = 0;
        for (int[] interval : intervals) {
            if (interval[0] >= end) {
                end = interval[1];
            } else {
                remove++;
            }
        }
        System.out.println(remove);
    }
}
