public class ceiling_floor {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 6, 8, 9, 12, 34, 36 };
        int target = 7;
        //print smallest elemnt greater than or = target
        int ans = ceil(arr, target);
        System.out.println(ans);
        //print greatest element  smaller than or = target
        int ans2 = floor(arr, target);
        System.out.println(ans2);
    }
    //smallest number greater than or = target
    static int ceil(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        //target is greater than the greatest element in the array
        if (target > arr[arr.length - 1]) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return arr[start];
    }
    
    static int floor(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        //if target is smaller than smallest element in the array
        if (target < arr[arr.length - 1]) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return arr[end];
    }
}
