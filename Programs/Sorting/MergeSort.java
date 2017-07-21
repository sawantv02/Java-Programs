package Sorting;

import java.util.Arrays;

public class MergeSort {

	public static void main(String args[]) {
		int arr[] = { 5, 2, 6, 3, 1, 8, 4 };
		System.out.println("Merge Sort:");
		System.out.println("Given Array:"+Arrays.toString(arr));
		int result[]=mergeSort(arr);
		 System.out.println(Arrays.toString(result));
	}

	public static int[] mergeSort(int arr[]) {

		int n = arr.length;
		if (n < 2)
			return arr;
		int mid = n / 2;
		int left[] = new int[mid];
		int right[] = new int[n - mid];

		for (int i = 0; i < mid; i++)
			left[i] = arr[i];

		for (int j = mid; j < n; j++)
			right[j - mid] = arr[j];

		mergeSort(left);
		mergeSort(right);
		merge(left, right, arr);

		return arr;
	}

	public static int[] merge(int left[], int right[], int arr[]) {
		int nl = left.length;
		int rl = right.length;

		int i = 0, j = 0, k = 0;

		while (i < nl && j < rl) {
			if (left[i] < right[j]) {
				arr[k] = left[i];
				i = i + 1;
			} else {
				arr[k] = right[j];
				j = j + 1;
			}
			k = k + 1;
		}
		while (i < nl) {
			arr[k] = left[i];
			i = i + 1;
			k = k + 1;
		}
		while (j < rl) {
			arr[k] = right[j];
			j = j + 1;
			k = k + 1;
		}

		return arr;
	}

}
