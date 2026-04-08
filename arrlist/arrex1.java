class arrex1{
    public static void main(String[] args){
        int [][] arr = {
            {23,25,66,78},
            { 45, 76, 12 },
            { 65, 90 },
            { 34 } };
            
        for (int i = 0; i <= arr.length; i++) {
            for (int j = 0; j <= arr[i].length; i++) {
                System.out.println(arr[i][j]);
            }
            System.out.println();
        }        
    }
}