package Programs;

public class ReverseStringWithSpacePreserved {

	public static void main(String args[]) {

		String s = "Help Others";
		System.out.println(s.toCharArray());
		System.out.println(reverseStringWithSpacePreserved(s));
	}

	public static String reverseStringWithSpacePreserved(String s) {

		StringBuffer sb = new StringBuffer(s.length());

		for (int i = 0; i < s.length(); i++) {
			if (s.toCharArray()[i] == ' ') {
				char c = s.toCharArray()[i];
				sb.append(" ");
			} else
				sb.append("*");

		}
		int j=s.length()-1;
		for(int i=0;i<s.length();i++){
			if (s.charAt(i)!= ' '){

			if (sb.charAt(j)== ' ') {
				j--;
			}
			sb.setCharAt(j, s.charAt(i));
			j--;	
			}

		}
		
		return sb.toString();
	}

}
