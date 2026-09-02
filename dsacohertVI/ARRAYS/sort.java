import java.util.*;
class sort {
    public static void main(String[] args) {
        int[] arr = { 2, 36, 45, 18, 9, 1, 0 };

        //using inbuild method
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //without inbuild method
        for(int i=0; i<arr.length-1; i++){
		    if(arr[i] > arr[i+1]){
		        //swap
		        int temp = arr[i];
		        arr[i] = arr[i+1];
		        arr[i+1] = temp;
		    }
		}
		System.out.println(Arrays.toString(arr));
    }
}