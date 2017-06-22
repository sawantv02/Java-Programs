package BitManipulation;

public class DoubleToBinary {
	
	public static void main(String args[]){
		double d=0.625;
		System.out.print("Convert double to binary:");
		System.out.println(convertDoubleToBinary(d));
	}
	
	public static String convertDoubleToBinary(double d){
		
		if(d>=1 || d<=0)
			return "ERROR!";
		
		StringBuffer sb=new StringBuffer(".");
		
		while(sb.length()<=32 && d!=0){
			int temp=(int)(d*2);
			sb.append(temp);
			d=(d*2)-temp;
		}
		if(sb.length()>32)
			return "ERROR!";
		else
			return sb.toString();
	}

}
