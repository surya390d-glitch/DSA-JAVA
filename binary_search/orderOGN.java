public class orderOGN {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        // int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = 7;
        int ans = search(arr,target);
        System.out.println(ans);
    }
    static int search(int [] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        
        int start = 0;
        int end = arr.length;
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start - (end + start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

            else {
                if (arr[mid] > target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}