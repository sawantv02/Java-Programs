package Graphs;

public class Neighbor {
	
	public int vertexNum;
	public Neighbor next;
	
	public Neighbor(int vNum,Neighbor nbr){
		this.vertexNum=vNum;
		next=nbr;
	}

}
