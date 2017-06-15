package Programs;

public class ValidNumberStringCheck {

	public static void main(String args[]){
		
		String strint="2587";
		
		String strfloat="256.365";
		
		String str="abcd";
		
		System.out.println("Check if strint is a valid number:"+strint);
		checkNumber(strint);
		System.out.println("Check if strfloat is a valid number:"+strfloat);
		checkNumber(strfloat);
		System.out.println("Check if string is a valid number:"+str);
		checkNumber(str);
	}
	
	public static void checkNumber(String str){
		
		try{
			int i=Integer.parseInt(str);
			System.out.println("Number is valid Integer!");
			
		}catch(NumberFormatException ex){
			System.out.println("Number is not valid Integer!!");
		}
		
		try{
			float f=Float.parseFloat(str);
			System.out.println("Number is valid float!");
		}catch(NumberFormatException ex){
			System.out.println("Number is not valid float!!");
		}
		
	}
}
