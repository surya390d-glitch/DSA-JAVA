import java.util.Scanner;
public class Condition_loops {
    public static void main(String []args){
        If_cond();
        //Forloop();
        whileloop();
    }
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //PROGRAM FOR IF CONDITION WITH SYNTAX & EXAMPLE//
    /* syntax for if else condition
        if(CONTION){
       //BODY WHATEVER YOU WANT WRITE  
       } */
 //FOR EXAMPLE:
    public static void If_cond(){
        //IF CONDITION 
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your salry amount: ");
        int salary = in.nextInt();
        if (salary > 25000){
            salary = salary + 2800;
        }
        else if(salary > 30000){
            salary = salary + 4800;
        }
        else{
            salary += 1000;
        }
        System.out.println("salary status: "+ salary);
        in.close();
    } 
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*    public static void Forloop(){
// PROGRAM FOR FORLOOP WITH SYNTAX AND EXAMPLE //
   //SYNTAX:
         //   for(initialization : condition||end : increament) {
                  //BODY WHATEVER YOU WANT WRITE
                }    
//FOR EXAMPLE:

    for(int i = 0 ; i <= 9 ; i+=1){
        System.out.print(i+ " ");//output like this : 0123456789 
    }

    //PRINT NUMBERS FROM 1 TO N
    Scanner in = new Scanner(System.in);
    System.out.print("\nEnter the number: ");
    int num = in.nextInt();
    for(int i= 0 ; i <=num ; i++){
        System.out.print(i + " ");
    }
    }*/
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//WHILE LOOP SYNTAX AND EXAMPLE PROGRAM
/*SYNTAX:
        inialization;
        while(CONDITION) {
            //body(whatever you want write here)
            increment || decreament
        }   */
    public static void whileloop(){
        int a = 1; //INITIALIZATION
        System.out.println();
        while(a != 11){ //CONDITION
            System.out.print(a + " ");
            a++; //INCREAMENT || DECREAMENT
        }
    }
}
