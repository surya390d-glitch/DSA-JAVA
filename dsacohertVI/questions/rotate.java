import java.util.*;
class rotate {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 4;
        int n = arr.length-1;
        rev(arr, 0, n);
        System.out.println(Arrays.toString(arr));
        rev(arr,0 ,k-1);
        System.out.println(Arrays.toString(arr));
        rev(arr, k, n);
        System.out.println(Arrays.toString(arr));
    
    }

    static void rev(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
