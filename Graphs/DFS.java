package Graphs;

import java.io.FileNotFoundException;

public class DFS {
	
	public static void main(String args[]) throws FileNotFoundException{

		Graph g=new Graph("dfsinput.txt");
		g.dfs();
	}

}
