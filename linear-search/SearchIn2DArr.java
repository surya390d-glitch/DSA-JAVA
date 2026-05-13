public class SearchIn2DArr {
    public static void main(String[] args) {
        int[][] arr = { { 12, 34, 56 },
                        {21,32,54,65},
                { 99, 81, 10 },
                    { 98, 87, 19 } };
        int target = 19;
        // int[] res1 = check(arr, target);
        // System.out.println(Arrays.toString(res1));

        int res2 = checkMax(arr);
        System.out.println(res2);              
    }

    static int[] check(int[][] arr, int target) {
        if (arr.length == 0) {
            return new int[] { -1, -1 };
        }
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                if (arr[r][c] == target) {
                    return new int[] { r, c };
                }
            }
        }
        return new int[] { -1, -1 };
    }
    
    static int checkMax(int[][] arr) {
        if (arr.length == 0) {
            return Integer.MIN_VALUE;
        }

        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int elements : ints) {
                if (elements > max) {
                    max = elements;
                }
            }
        }
        return max;
    }
}
