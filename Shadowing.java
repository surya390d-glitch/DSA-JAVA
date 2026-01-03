public class Shadowing {
    static int num = 390;// this variable scopes the entire block. so, we acces the variable from anywhere.
    public static void main(String [] args){
        System.out.println(num);// 390 will print
        int num = 890;
        System.out.println(num);// 890 will print. because in the line shadow the num in line 5.("Local variable hides a field")
        shadow();
    }
    public static void shadow(){
        System.out.println(num);// 390 will print
    }
}
