package Programs;

import java.util.HashSet;
import java.util.Set;

public class HappyNumbers {

	public static void main(String args[]) {

		for(int i=1;i<=100;i++){
			checkHappy(i);
		}
	}

	public static boolean checkHappy(int n) {

		HashSet<Integer> check = new HashSet<Integer>();
		int h=n;
		while (!check.contains(h)) {
//			System.out.println(check);
			check.add(h);
			
			h = getSum(h);
			
			if (h == 1) {
				System.out.println(n);
				return true;
			}
			
		}

		return false;
	}

	public static int getSum(int n) {
		int sq = 0;

		while (n > 0) {
			sq += (n % 10) * (n % 10);
			n = n / 10;
		}

		return sq;
	}
}
