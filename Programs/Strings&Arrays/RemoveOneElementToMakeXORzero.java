package Programs;

public class RemoveOneElementToMakeXORzero {
	
	public static void main(String args[]){
		
		String input="100011100";
		System.out.println("Ways to remove one element from a binary string so that XOR becomes zero:");
		System.out.println(removeOneElementToMakeZORZero(input));
	}
	
	public static int removeOneElementToMakeZORZero(String input){
		
		int count=0;
		int numones=0;
		int numzeros=0;
		
		for(char ch:input.toCharArray()){
			if(ch=='1')
				numones++;
			else
				numzeros++;		
		}
		
		if(numones%2==0)
			return numzeros;
		return numones;

	}

}
