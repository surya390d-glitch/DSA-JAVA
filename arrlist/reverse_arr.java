public class reverse_arr {
    public static void main(String[] args) {
        int []arr = { 1, 2, 3, 4, 5, 6, 8, 9 };
        reverse(arr);
    }
    static void revrse(int[] arr,int start, int end) {
        start = arr[0];
        end = arr.length;
        swap(arr,index1,index2){
            start ++;
            end --;
        }
    }
    
    static void swap(int []arr,int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;        
    }
}
