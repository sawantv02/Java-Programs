package Programs;

public class ShortestPalindrome {
	
	public static void main(String args[]){
		
		String str="abcd";
		System.out.println("String:"+str);
		System.out.println("Shortest Palindrome:"+shortestPalindrome(str));
	}
	
    public static String shortestPalindrome(String s) {
        int i=s.length();
        String newStr=s;
        String temp="";
        while(isPalindrome(newStr)==false){
            temp=temp+s.charAt(i-1);
            newStr=temp+s;
            i--;
        }
        
        return newStr;
        
    }
    
    public static boolean isPalindrome(String s){
        
    	String st=new StringBuffer(s).reverse().toString();
        if(s.equals(st))
            return true;
        else
            return false;
    }

}
