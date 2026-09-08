import java.util.*;
public class intersection {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int []nums2 = {9,4,9,8,4};

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> resset = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            if (set1.contains(num)) {
                resset.add(num);
            }
        }


        int[] setarr = new int[resset.size()];

        int i = 0;

        for (int setele : resset) {
            setarr[i++] = setele;
        }

        System.out.println(Arrays.toString(setarr));
    }
}
