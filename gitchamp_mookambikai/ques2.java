import java.util.Scanner;
public class ques2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int unit = in.nextInt();
        String senior_citizen = in.nextLine();
        Unit obj = new Unit(unit, senior_citizen);
        // obj.display();
        obj.split();
    }
    
    
}

class Unit {
    int unit;
    String senior_citizen;

    Unit(int unit, String senior_citizen) {
        this.unit = unit;
        this.senior_citizen = senior_citizen;
    }

    void split() {
        for (int i = 0; i <= unit; i++) {
            if (i <= 100) {
                int price = i * 5;
                System.out.println(unit+" unit price: "+price);
            } else if (i <= 200) {
                int price = i * 7;
                System.out.println( unit+ " unit price: "+price);
            } else if (i >= 300) {
                int price = i * 10;
                System.out.println(unit +" unit price: "+price);
            }

        }
        
    }

    void calculation() {

    }

    void dis() {

    }
    
    void display() {
        
    }
    }

    //this program is not completed yet
    