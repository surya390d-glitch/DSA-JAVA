

public class Binary {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int target = 8;
        int ans = search(arr, target);
        System.out.println(ans);
    }
    
    static int search(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        int start = 0;
        int end = arr.length;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
