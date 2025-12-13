/* In switch statement , you can jump to various cases based on your expression. 
SYNTAX: 
    switch(EXPRESSION) {
    //cases
        case 1:
        //DO SOETHING
        break;

        case 2:
        //DO SOMETHING;
        break;

        default:
        //do soething.
        } */
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//FOR EXAMPLE:
import java.util.Scanner;
public class Switchstate_Nestedcase {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your day: ");
        String day = in.nextLine();
        Switch(day);
    }
    public static void Switch(String day){
        switch(day){ //cases have to be same type as expression.must be constant or literal. 
                     //EX: if the switch is days -----> the expression must be a weekdays and weekends.(like sunday, monday,tuesday,...and so on).
                     //duplicate cases are not allowed.
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
            System.out.println("weekday.");
            break; // here, break is used to terminate the sequence.
                   //if break is does not used,it will continue to next expression.

            case "saturday":
            case "sunday":
            System.out.println("weekend.");
            break;
            default://default will executed when non of the above does.
                    //if default is not at the end, put brak after it.
            System.out.println("invalid day. please enter the valid day.");
        }
    }
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
