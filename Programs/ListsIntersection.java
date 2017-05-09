package Programs;

import java.util.ArrayList;
import java.util.HashSet;

public class ListsIntersection {

	public static void main(String args[]){
		ArrayList<Integer> a=new ArrayList<>();
		ArrayList<Integer> b= new ArrayList<>();
		
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		
		b.add(30);
		b.add(40);
		b.add(50);
		b.add(60);
		b.add(70);
		
		HashSet<Integer> intersection=new HashSet<>();
		
		for(int ina :a){
			intersection.add(ina);
		}
		
		for(int inb:b){
			if(intersection.contains(inb))
				System.out.println(inb);
		}

//		a.addAll(b);
//		System.out.println(a);
//		
//		a.retainAll(b);
//		System.out.println(a);
		
		
		
	}
}
