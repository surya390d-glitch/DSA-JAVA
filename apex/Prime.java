import java.util.Scanner;
class Prime{
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter The Number To Check: ");
    int num = in.nextInt();
    boolean ans = check(num);
    System.out.println(ans);
  }
    
  //The Rule: If a number $N$ has a factor larger than $\sqrt{N}$, it must be paired with a factor smaller than $\sqrt{N}$.
  //"Mirror Rule" (Small Partner vs. Big Partner).
  //The GoalWe want to know: Does num have ANY factors?(If yes $\rightarrow$ Not Prime. If no $\rightarrow$ Prime.)
  /*The "Mirror Rule" in Action
    Remember: Factors come in pairs. A Small Partner ($< \sqrt{N}$) and a Big Partner ($> \sqrt{N}$).We only need to search for the Small Partner.If we don't find a Small Partner, the Big Partner cannot exist.*/
  static boolean check(int num) {
    if(num <= 1){
      return false;
    }
    int c = 2;
    while(c*c < num){
      if(num % c == 0){
      return false;
      }
      c++; 
    }
    return c*c > num;
  }
}
