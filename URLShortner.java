package Programs;

public class URLShortner {
	
	public static final String ALPHABETS="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	public static final int BASE=ALPHABETS.length();
	public static void main(String args[]){
		
		int n=12345;
		System.out.println("Shot URL-----------------");
		String shorturl=idToShortURL(n);
		System.out.println(shorturl);
		
		System.out.println("ID from URL--------------");
		int num=shortURLtoID(shorturl);
		System.out.println(num);
		
		
		
	}
	
	public static String idToShortURL(int n){
		StringBuffer br=new StringBuffer();
		while(n>0){
			br.insert(0,ALPHABETS.charAt(n%BASE));
			n=n/BASE;
		}
		
		return br.toString();
	}
	
	public static int shortURLtoID(String url){
		int num=0;
		for(int i=0;i<url.length();i++){
			num=num*BASE+ALPHABETS.indexOf(url.charAt(i));
		}
		
		return num;
	}
	
}
