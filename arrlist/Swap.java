public class Swap {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 56, 7, 8, 99 };
        // swap(arr, 1, 4);
        // System.out.println(Arrays.toString(arr));
        max(arr,5,8);
    }

    static void swap(int[] arr, int ind1, int ind2) {
        int temp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = temp;

    }

    static void max(int[] arr, int start, int end) {
        int max = arr[start];
        // for (int i : arr) {
        //     if (arr[i] > max) {
        //         max = arr[i];
        //     }
        for(int i=start ; i<end; i++){
            if (arr[i] > max) {
                max = arr[i];
            }
        }
            System.out.println(max);
        }
}
