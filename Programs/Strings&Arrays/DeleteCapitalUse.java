package Programs;

public class DeleteCapitalUse {

	public static void main(String args[]) {
		String w1 = "USA";

		System.out.println(detectCapitalUse(w1));
		System.out.println(detectCapitalUse("usa"));
		System.out.println(detectCapitalUse("USa"));
		System.out.println(detectCapitalUse("Google"));
	}
	

	public static boolean detectCapitalUse(String word) {
        int cnt = 0;
        for(char c: word.toCharArray()) if('Z' - c >= 0) cnt++;
        return ((cnt==0 || cnt==word.length()) || (cnt==1 && 'Z' - word.charAt(0)>=0));
	}
}
