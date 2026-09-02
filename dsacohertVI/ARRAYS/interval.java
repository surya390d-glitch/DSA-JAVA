import java.util.*;
//https://leetcode.com/problems/insert-interval/description/

public class interval {
    public static void main(String[] args) {
        int[][] intervals = { {1,2}, {3,5}, {6,7}, {8,10}, {12,16} };
        int[] newintr = { 4, 8 };
        ArrayList<int[]> res = new ArrayList<>();
        for (int[] interval : intervals) {
            
            //CASE 1 — Current interval is before new interval
            if (interval[1] < newintr[0]) {
                // Current is BEFORE new
                res.add(interval);

            }
            //CASE 2 — Current interval is AFTER new interval
            else if (newintr[1] < interval[0]) {
                // Current is AFTER new
                res.add(newintr);
                newintr =interval ;
                }
                else {
                 //CASE 3 — They overlap
                 // They OVERLAP
                newintr[0] = Math.min(interval[0], newintr[0]);
                newintr[1] = Math.max(interval[1], newintr[1]);
            }
        }
        res.add(newintr);
        System.out.println(Arrays.deepToString(res.toArray(new int[res.size()][])));
    }
    
}
