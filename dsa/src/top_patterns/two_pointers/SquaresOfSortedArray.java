package top_patterns.two_pointers;
public class SquaresOfSortedArray{
    public int[] sortedSquares(int[] nums) {
    int left = 0, right = nums.length - 1;
    int[] result = new int[nums.length];
    int index = nums.length - 1;

    while (left <= right) {
        int l = nums[left] * nums[left];
        int r = nums[right] * nums[right];

        if (l > r) {
            result[index--] = l;
            left++;
        } else {
            result[index--] = r;
            right--;
        }
    }
    return result;
}

}