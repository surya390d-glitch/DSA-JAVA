import java.util.Arrays;
public class reverse {
    public static void main(String[] args) {
        int[] arr = { 15, 23, 45, 68, 89 };
        revers(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    static void revers(int[] arr) {
        if (arr.length == 0) {
            System.out.println("arr length 0");
        }

        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    
    static void swap(int[] arr, int ind1, int ind2) {
        int temp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = temp;
    }
}
