import java.util.*;
public class SearchIn2DArr {
    public static void main(String[] args) {
        int[][] arr = { { 12, 34, 56 },
                { 21, 32, 54, 65 },
                { 99, 81, 10 },
                { 98, 87, 19 } };
        int target = 19;
        // int[] res1 = check(arr, target);
        // System.out.println(Arrays.toString(res1));

        // int res2 = checkMax(arr);
        // System.out.println(res2);

        int[] ans3 = checkind(arr);
        System.out.println(Arrays.toString(ans3));
        System.out.println("Max value = " + arr[ans3[0]][ans3[1]]);
    }
    
    static int[] checkind(int[][] arr) {
        if (arr.length == 0) {
            return new int[] { -1, -1 };
        }
        int row = -1;
        int col = -1;
        int max = Integer.MIN_VALUE;
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                if (max < arr[r][c]) {
                    max = arr[r][c];
                    row = r;
                    col = c;
                }
            }
        }
        return new int[] { row,col }; //full traversal 
        // return new int[] { -1, -1 };
    }

    // static int[] check(int[][] arr, int target) {
    //     if (arr.length == 0) {
    //         return new int[] { -1, -1 };
    //     }
    //     for (int r = 0; r < arr.length; r++) {
    //         for (int c = 0; c < arr[r].length; c++) {
    //             if (arr[r][c] == target) {
    //                 return new int[] { r, c };
    //             }
    //         }
    //     }
    //     return new int[] { -1, -1 };
    // }
    
    // static int checkMax(int[][] arr) {
    //     if (arr.length == 0) {
    //         return Integer.MIN_VALUE;
    //     }

    //     int max = Integer.MIN_VALUE;
    //     for (int[] ints : arr) {
    //         for (int elements : ints) {
    //             if (elements > max) {
    //                 max = elements;
    //             }
    //         }
    //     }
    //     return max;
    // }

    
}
