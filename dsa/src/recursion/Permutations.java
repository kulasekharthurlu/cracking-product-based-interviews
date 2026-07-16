package recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutations{
public void permute(int[] nums, int start, List<List<Integer>> res) {
    if (start == nums.length) {
        List<Integer> list = new ArrayList<>();
        for (int n : nums) list.add(n);
        res.add(list);
        return;
    }

    for (int i = start; i < nums.length; i++) {
        swap(nums, i, start);
        permute(nums, start + 1, res);
        swap(nums, i, start);
    }
}

private void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
}