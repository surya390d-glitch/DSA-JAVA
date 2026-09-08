public class long_pol {
    public static void main(String [] args){
        String s = "abccccdd";
        int hash[] = new int [128];
        for(char i: s.toCharArray()){
            hash [1- '0'] ++;
        }
        boolean flag = false;
        int res = 0;
        for(int i:hash){
            if(i%2 == 0){
                res += (i/2);
            }
            else{
                flag = true;
                res += (i-1)/2;
            }
        }
        System.out.println(flag ? (res*2) + 1 : res * 2);
    }
}
