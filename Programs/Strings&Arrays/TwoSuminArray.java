package Programs;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSuminArray {

	public static void main(String args[]) {
		int arr[] = { 1, 2, 4 };
		int target = 5;
		System.out.println("Find indices of two numbers such that they add up to target in array:");
		System.out.println(Arrays.toString(twoSum(arr, target)));
	}

	public static int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];

		HashMap<Integer, Integer> n = new HashMap<>();
		int index = 0;
		for (int i : nums) {
			n.put(i, index);
			index++;
		}
		int i;
		for (i = 0; i < nums.length; i++) {
			int check = target - i;
			if (n.containsKey(check) && check != i) {
				result[0] = n.get(i);
				result[1] = n.get(check);
				break;
			}
		}

		if (i < 3)
			return result;
		else
			return null;

	}

}
