package arrays.searching;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int searchElement = 10;
		int resultIndex = findByBinarySearch(arr, searchElement);
		System.out.println(resultIndex);
	}

	public static int findByBinarySearch(int[] arr, int searchElement) {
		if (arr == null || arr.length == 0) {
			return -1;
		}

		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (arr[mid] == searchElement) {
				return mid;
			} else if (arr[mid] < searchElement) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return -1;

	}
}
