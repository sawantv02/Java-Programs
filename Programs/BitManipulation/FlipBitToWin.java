package BitManipulation;

import java.util.ArrayList;

public class FlipBitToWin {

	public static void main(String args[]){
		
		int input =1775;
		binaryConvertor(input);
		
		System.out.println("Find longest sequence of 1s by flipping a bit:"+longestSequence(input));

		
		
		
	}
	
	public static int longestSequence(int n){
		if(n==-1)
			return Integer.BYTES*8;
		ArrayList<Integer> sequence=getAlternateSequence(n);
		System.out.println(sequence);
		return findLongestSequence(sequence);
	}
	
	public static int findLongestSequence(ArrayList<Integer> sequence){
		int maxseq=1;
		
		for(int i=0;i<sequence.size();i+=2){
			int zeroseq=sequence.get(i);
			int onesright=i-1>=0?sequence.get(i-1):0;
			int onesleft=i+1<sequence.size()?sequence.get(i+1):0;
			
			int thisseq=0;
			if(zeroseq==1){
				thisseq=onesleft+1+onesright;
			}
			if(zeroseq>1){
				thisseq=1+Math.max(onesleft,onesright);
			}else if(zeroseq==0){
				thisseq=Math.max(onesleft,onesright);
			}
			
			maxseq=Math.max(thisseq,maxseq);		
		}
		return maxseq;
	}
	public static ArrayList<Integer> getAlternateSequence(int n){
		
		ArrayList<Integer> sequence=new ArrayList<>();
		
		int flag=0;
		int counter=0;
		for(int i=0;i<Integer.BYTES*8;i++){
			
			if((n & 1)!=flag){
				sequence.add(counter);
				flag=n & 1;
				counter=0;
			}
			
			counter++;
			n >>>= 1;
			
		}
		sequence.add(counter);
		return sequence;
		
	}
	public static void binaryConvertor(int num){
		
		StringBuffer sb=new StringBuffer();
		
		while(num>0){
			sb.append(num%2);
			num=num/2;
		}
		
		System.out.println(sb.reverse());
	}

}

