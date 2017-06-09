package Programs;

public class LengthOfLastWordInString {
	
	public static void main(String args[]){
		String str="Catch me if you can";
		
		System.out.println("Length of last word in String Approach1:"+lengthOfLastWordApproach1(str));
		System.out.println("Length of last word in String Approach2:"+lengthOfLastWordApproach2(str));
		
	}
	
	public static int lengthOfLastWordApproach1(String str){
		
		str=str.trim();
		
		String arr[]=str.split(" ");
		
		int last=arr[arr.length-1].length();
		
		return last;
	}

	public static int lengthOfLastWordApproach2(String str){
		
		boolean flag=false;
		int len=0;
		for(int i=str.length()-1;i>=0;i--){
			
			if(Character.isLetter(str.charAt(i))){
				flag=true;
				len++;
			}else{
				if(flag==true)
					return len;
			}
		}
		return len;
	}
}
