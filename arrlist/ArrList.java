import java.util.*;
public class ArrList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        Basic_Fun_ArrL(list);
        arr(list);
    }
    
    static void Basic_Fun_ArrL(ArrayList<Integer> list) {
        list.add(50);
        list.add(100);
        list.add(110);
        list.add(150);
        list.add(260);
        System.out.println(list);
        System.out.println(list.contains(110));
        list.remove(3);
        System.out.println(list);
        list.set(1, 290);
        System.out.println(list);
        arr(list);
    }

    static void arr(ArrayList <Integer> list) {
        for (int n : list) {
        
            System.out.println(n);
        }
    }
}
