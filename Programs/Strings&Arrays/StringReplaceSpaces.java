package Programs;

public class StringReplaceSpaces {

	public static void main(String args[]){
		String s="   My First Page    ";
		System.out.println("Replace space with '%20'-----------------");
		System.out.println(replaceSpace(s));
		
	}
	
	public static String replaceSpace(String s){
		String replace="%20";
		char ch[]=s.trim().toCharArray();
		StringBuffer bf=new StringBuffer();
		for(char c:ch){
			if(c==' ')
				bf.append(replace);
			else
				bf.append(c);
			
		}
		
		return bf.toString();
	}
}
