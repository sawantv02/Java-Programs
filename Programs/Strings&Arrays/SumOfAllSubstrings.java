package Programs;

public class SumOfAllSubstrings {

	public static void main(String args[]) {
		String number = "1234";
		System.out.println("Sum of Substrings:"+sumOfSubstrings(number));
	}

	public static int sumOfSubstrings(String number) {
		int n = number.length();
		int sum=0;
		int i = 0;
		while (n > 0 && i<n) {
				String sub = number.substring(i, n);
				System.out.println(sub);
				if(!sub.equals(""))
					sum += Integer.parseInt(sub);
				i++;
				if(i==n){
					n--;
					i=0;
				}

		}
		
		return sum;
	}

}
