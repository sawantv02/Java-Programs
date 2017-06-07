package Programs;

public class ToggleStringCharacters {
	
	public static void main(String args[]){
		String str="ABceD%$";
		System.out.println("Toggle the characters of the string:"+toggleCharacters(str));
	}
	
	public static String toggleCharacters(String str){
		char ch[]=str.toCharArray();
		
		for(int i=0;i<str.length();i++){
			
			if(ch[i]>='A' && ch[i]<='Z')
				ch[i]=(char) (ch[i] +(char)('a'-'A'));
			else if(ch[i]>='a' && ch[i]<='z')
				ch[i]=(char) (ch[i]-(char)('a'-'A'));
				
		}
		
		return String.valueOf(ch);
	}

}
