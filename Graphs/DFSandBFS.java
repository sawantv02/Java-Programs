package Graphs;

import java.io.FileNotFoundException;

public class DFSandBFS {
	
	public static void main(String args[]) throws FileNotFoundException{

		Graph g=new Graph("dfsinput.txt");
		System.out.println("===========DFS Traversal================");
		g.dfs();
		System.out.println("===========BFS Traversal================");
		g.bfs();
	}

}
