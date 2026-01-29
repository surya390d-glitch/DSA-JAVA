public class Shadowing {
    static int num = 390;// this variable scopes the entire block. 
                        //so, we acces the variable from anywhere. this will be shadowed at the line 5.
    public static void main(String [] args){
        System.out.println(num);// 390 will print
        int num = 890;
        System.out.println(num);// 890 will print. because in the line shadow the num in line 5.
                                //("Local variable hides a field")
        //shadow();
        varargs(1,2,"rock","feller");
        fun(76);
        fun("velu"); //compiler decide which function that is contain(int,string) 

    }
    public static void shadow(){  
        System.out.println(num);// 390 will print
    }
//VAERIABLE LENGTH ARGUMENT
    static void varargs(int a, int b,String...y){//variable length argument should will be come the end.     
        // System.out.println(v);
    }

    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println(name);
    }
}
