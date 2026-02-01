import java.util.Scanner;
class Prime{
  public static void main(String args[]){
     Scanner in = newScanner(System.in);
     int num = in.nextInt();
     boolean ans = check(num);
     System.out.println(ans);
  }
  static boolean check(int num) {
    if(num <= 1){
      return false;
    }
    int c = 2;
    while(c*c < num){
      if(num % 2 == 0){
        return false;
      }
     }
     return c*c > num;
  }
}
