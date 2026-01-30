package arrays;

public class PalindromeArray {
	public static boolean isPalindrome(int[] arr) {
		if (arr == null || arr.length <= 1) {
			return true;
		}
		int left = 0;
		int right = arr.length - 1;

		while (left < right) {
			if (arr[left] != arr[right]) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 2, 1 };

		if (isPalindrome(arr)) {
			System.out.println("The array is a palindrome");
		} else {
			System.out.println("The array is not a palindrome");
		}
	}
}
