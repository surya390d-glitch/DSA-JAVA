import java.util.Scanner;
public class Twosum {
    public static void main(String []args) {
        Scanner in = new Scanner(System.in);
        int [] nums = {1,2,3,4,5,6,7,8,9};
        System.out.print("Enter your target: ");
        int target = in.nextInt();
        int [] ans = twosum(nums,target);
        System.out.println(ans[0]+" "+ans[1]);
    }
    public static int [] twosum(int []nums,int target){
        for(int i = 0;i < nums.length;i++){
            for(int j = i+1;j < nums.length;j++){
                if(nums[j] == target-nums[i]){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}