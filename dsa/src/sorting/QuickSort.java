package sorting;

import java.util.Arrays;

public class QuickSort {

	public void sort(int[] arr, int low, int high) {
		if (low < high) {
			int p = partition(arr, low, high);
			sort(arr, low, p - 1);
			sort(arr, p + 1, high);
		}
	}

	public int partition(int[] arr, int low, int high) {
		int povote = arr[high];
		int i = low;
		int j = low;
		while (i <= high) {
			if (arr[i] <= povote) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
			i++;
		}
		return j - 1;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 2, 9, 7 };
		QuickSort qs = new QuickSort();
		qs.sort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

}