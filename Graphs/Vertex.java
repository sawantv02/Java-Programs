package Graphs;

public class Vertex {
	
	String name;
	Neighbor adjList;
	public Vertex(String vname,Neighbor nbr){
		this.name=vname;
		this.adjList=nbr;
	}

}
