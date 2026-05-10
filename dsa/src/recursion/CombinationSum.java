public class CombinationSum{
public void combinationSum(int[] nums, int target, int i,
                          List<Integer> curr, List<List<Integer>> res) {
    if (target == 0) {
        res.add(new ArrayList<>(curr));
        return;
    }
    if (i == nums.length || target < 0) return;

    curr.add(nums[i]);
    combinationSum(nums, target - nums[i], i, curr, res);
    curr.remove(curr.size() - 1);

    combinationSum(nums, target, i + 1, curr, res);
}
}