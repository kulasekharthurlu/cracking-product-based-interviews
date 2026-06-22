import java.util.*;

public class UnionOfArrays {

    public static int[] union(int[] nums1, int[] nums2) {

        Set<Integer> set = new HashSet<>();

        for (int num : nums1) {
            set.add(num);
        }

        for (int num : nums2) {
            set.add(num);
        }

        int[] result = new int[set.size()];
        int index = 0;

        for (int num : set) {
            result[index++] = num;
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {3, 4, 5, 6};

        System.out.println(Arrays.toString(union(nums1, nums2)));
    }
}