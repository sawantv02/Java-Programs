package Searching;

public class SearchElementInCircularSortedArray {

	public static void main(String args[]) {

		int arr[] = { 12, 14, 16, 18, 2, 3, 5, 9 };
		int number = 18;

		System.out.println("Search Element in circular sorted array using Binary search:");
		System.out.println(searchElement(arr, number));
	}

	public static int searchElement(int arr[], int n) {
		int low = 0, high = arr.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (n == arr[mid])
				return mid;
			else if (arr[mid] <= arr[high]) {
				if (n > arr[mid] && n <= arr[high]) {
					low = mid + 1;
				} else
					high = mid - 1;
			} else {
				if (n >= arr[low] && n < arr[mid]) {
					high = mid - 1;
				} else
					low = mid + 1;
			}
		}

		return -1;
	}
}
