public class SearchFrom_range {

    public static void main(String[] args) {
        int[] arr = { 6, 7, 8, 9, 11, 2, 3, 4, 5 };
        // Scanner in = new Scanner(System.in);
        // System.out.print("Enter your target: ");
        // int target = in.nextInt();
        // int ans1 = range_max(arr, target,3,6);
        // System.out.println(ans1);

        int ans2 = range_min(arr);
        System.out.println(ans2);

    }

    static int range_max(int[] arr, int target, int ind1, int ind2) {
        if (arr.length == 0) {
            return Integer.MIN_VALUE;
        }

        for (int i = ind1; i <= ind2; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return Integer.MAX_VALUE;
    }
    
    static int range_min(int[] arr) {
        int ans = arr[0];
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < ans) { /// if you want to find the maximum number in the array, you just only change
                                /// the '<' into '>'.
                ans = arr[i];
                index = i;
                // return index;
                // return ans;
            }
        }
        return ans;
        // return index;
        // return new int[] { ans, index };
    }
}
