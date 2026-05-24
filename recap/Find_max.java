public class Find_max {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 400, 50, 60 };
        int ans = check(arr);
        System.out.println(ans);
    }

    static int check(int[] arr) {
        if (arr.length < 0) {
            return -1;
        }
        int max = Integer.MIN_VALUE;
        for (int elements : arr) {
            if (elements > max) {
                max = elements;
            }
        }
        return max;
    }
}
