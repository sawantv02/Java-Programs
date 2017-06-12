package Programs;

public class SpacesBeforeUppercase {
	
	public static void main(String args[]){
		String s="BruceWayneIsBatman";
		
		System.out.println("Put spaces between words starting with capital letters:");
		convertToSpacedLowercase(s);
		
		
	}
	
	public static void convertToSpacedLowercase(String s){
		int n=s.length();
		
		for(int i=0;i<n;i++){
			char ch=s.toCharArray()[i];
			if(ch>='A' && ch<='Z'){
				ch=(char) (ch+32);
				
				
				if(i!=0){
					System.out.print(" ");
				}
				System.out.print(ch);


			}
			else{
			System.out.print(ch);
			}
		}

	}

}
