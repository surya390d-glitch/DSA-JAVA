import java.util.*;

public class Arr_list {
    public static void main(String[] args) {
        ArrayList<Integer> elements = new ArrayList<>();
        elements.add(12);
        elements.add(34);
        elements.add(98);
        elements.add(80);
        elements.add(23);
        System.out.println(elements);
        elements.remove(2);
        System.out.print("after remove: " + elements);
        elements.set(3, 10000);
        System.out.println("\nafter set element: " + elements);
        System.out.println(elements.contains(456));
        System.out.println(elements.contains(10000));
//---------------------------------------------------------------------------------------------------
        

//---------------------------------------------------------------------------------------------------
        // Get_Input obj = new Get_Input();
        // obj.call();
        Multi_dim obj = new Multi_dim();
        obj.mul();

    }

}

class Get_Input {
    void call() {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        //get input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        //get the elements at any index
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i));//pass index here, list[index] will not work here
        }
        //System.out.println(list);
    }
}

class Multi_dim {
    void mul() {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        //Initialitation
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }
        //add elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }
        }
        System.out.println(list);
    }
}



