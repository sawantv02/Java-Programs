package Programs;

public class FindOtherTwoSidesOfRightAngleTriangle {

	public static void main(String args[]) {

		int a = 11;
		System.out.println("Find other two sides of right angle triangle-a:"+a);
		otherTwoSidesOfRightAngleTriangle(a);
	}

	public static void otherTwoSidesOfRightAngleTriangle(int a) {

		int b = -1;
		double c = -1;

		for (b = 1; b < a * a; b++) {

			double temp = Math.sqrt(a * a + b * b);

			if (temp == Math.floor(temp) && !Double.isInfinite(c)) {
				c=temp;
				break;
			}

		}

		if (b != -1 && c != -1) {
			System.out.println("b:" + b);
			System.out.println("c:" + (int) c);
		} else
			System.out.println("-1");
	}

}
