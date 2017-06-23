package BitManipulation;

public class SwapOddEvenBits {
	
	public static void main(String args[]){
		int num=10;
		
		System.out.println("number:"+binaryConvertor(num));
		
		int ans=((num & 0xaaaaaaaa)>>>1 | (num & 0x55555555)<<1);
		System.out.println("Number after swapping odd even bits:"+binaryConvertor(ans));
		
	}
	
	public static String binaryConvertor(int num) {

		StringBuffer sb = new StringBuffer();

		while (num > 0) {
			sb.append(num % 2);
			num = num / 2;
		}

		return sb.reverse().toString();
	}
	

}
