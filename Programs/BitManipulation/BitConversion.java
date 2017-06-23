package BitManipulation;

public class BitConversion {

	public static void main(String args[]) {

		int num1 = 29;
		System.out.print("num1:" + num1 + "-"+binaryConvertor(num1));

		System.out.println();

		int num2 = 15;
		System.out.print("num2:" + num2 + "-"+binaryConvertor(num2));
		
		System.out.println();
		System.out.println("Number of bits need to be flipped to convert num1 to num2:"+binConversionForFlipping(num1, num2));

	}

	public static String binaryConvertor(int num) {

		StringBuffer sb = new StringBuffer();

		while (num > 0) {
			sb.append(num % 2);
			num = num / 2;
		}

		return sb.reverse().toString();
	}

	public static int binConversionForFlipping(int num1, int num2) {
		int xor = num1 ^ num2;
		
		String s=binaryConvertor(xor);
		
		int count=0;
		for(char ch:s.toCharArray()){
			if(ch=='1'){
				count++;
			}
		}

		return count;
	}
}
