package Searching;

public class CountOccurrencesInSortedArrayWithDuplicates {

	public static void main(String args[]) {

		int arr[] = { 1, 2, 2, 5, 5, 5, 5, 5, 6, 6, 7, 8, 9, 10 };
		int number = 5;
		System.out.println("Count Occurences of a number in a sorted array with duplicates using binary search:");
		int first = countOccurrences(arr, number, true);

		if (first == -1)
			System.out.println(0);
		else {
			int last = countOccurrences(arr, number, false);
			System.out.println(last - first + 1);
		}
	}

	public static int countOccurrences(int arr[], int n, boolean searchfirst) {

		int low = 0, high = arr.length - 1, result = -1;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (n == arr[mid]) {
				result = mid;
				if (searchfirst == true)
					high = mid - 1;
				else
					low = mid + 1;

			} else if (n < arr[mid])
				high = mid - 1;
			else
				low = mid + 1;
		}

		return result;
	}
}
