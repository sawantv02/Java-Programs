package Programs;

public class CountVowelsInString {
	
	public static void main(String args[]){
		
		String str="geeks for geeks portal";

		
		System.out.println("Count number of vowels in a string:"+vowelCountInString(str));
		System.out.println("Count vowels using recursion:"+recurVowelCount(str));
	}

	
	public static int vowelCountInString(String str){
		
		int count=0;
		
		for(int i=0;i<str.length();i++){
			char ch=str.toLowerCase().toCharArray()[i];
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
				count++;
			}
		}
		
		return count;
	}
	
	public static int recurVowelCount(String str){
		if(str.length()>0){
			int count=0;
			if(str.charAt(0)=='a'||str.charAt(0)=='e'||str.charAt(0)=='i'||str.charAt(0)=='o'||str.charAt(0)=='u')
				count=1;
			else
				count=0;
			count+=recurVowelCount(str.substring(1));
			return count;
		}

		return 0;
		
	}

}
