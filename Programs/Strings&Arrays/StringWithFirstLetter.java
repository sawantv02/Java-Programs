package Programs;

public class StringWithFirstLetter {
	
	public static void main(String args[]){
		String str="happy   coding";
		
		System.out.println("String containing first letter of every word:"+firstLettersInTheString(str));
		System.out.println("=========================");
		System.out.println("Using flag approach:"+firstLetterWithFlag(str));
		
	}

	public static String firstLettersInTheString(String str){
		
		int n=str.length();
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<n-1;i++){
			if(i==0 && str.toCharArray()[i]!=' ')
				sb.append(str.toCharArray()[i]);
			if(str.toCharArray()[i]==' ')
				continue;
			if(i>=1 && str.toCharArray()[i]!=' ' && str.toCharArray()[i-1]==' ')
				sb.append(str.toCharArray()[i]);

		}

		return sb.toString();
	}
	
	public static String firstLetterWithFlag(String str){
		StringBuffer sb=new StringBuffer();
		boolean flag=true;
		for(int i=0;i<str.length()-1;i++){
			if(str.toCharArray()[i]==' ')
				flag=true;
			if(str.toCharArray()[i]!=' ' && flag==true){
				sb.append(str.toCharArray()[i]);
				flag=false;
			}
		}
		
		return sb.toString();
	}
}
