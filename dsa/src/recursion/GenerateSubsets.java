public class GenerateSubsets{
public void subsets(int[] nums, int i, List<Integer> curr, List<List<Integer>> res) {
    if (i == nums.length) {
        res.add(new ArrayList<>(curr));
        return;
    }

    // include
    curr.add(nums[i]);
    subsets(nums, i + 1, curr, res);

    // exclude
    curr.remove(curr.size() - 1);
    subsets(nums, i + 1, curr, res);
}
}