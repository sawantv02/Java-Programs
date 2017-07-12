package Graphs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Graph {
	Vertex[] adjLists;

	public Graph(String file) throws FileNotFoundException {
		Scanner sc = new Scanner(new File(file));
		String graphtype = sc.next();
		boolean undirected = true;
		if (graphtype.equals("directed"))
			undirected = false;

		adjLists = new Vertex[sc.nextInt()];

		for (int v = 0; v < adjLists.length; v++) {
			adjLists[v] = new Vertex(sc.next(), null);
		}

		while (sc.hasNext()) {
			int v1 = indexForName(sc.next());
			int v2 = indexForName(sc.next());

			adjLists[v1].adjList = new Neighbor(v2, adjLists[v1].adjList);
			if (undirected)
				adjLists[v2].adjList = new Neighbor(v1, adjLists[v1].adjList);
		}

	}

	int indexForName(String name) {
		for (int v = 0; v < adjLists.length; v++) {
			if (adjLists[v].name.equals(name))
				return v;
		}
		return -1;
	}

	private void dfs(int v, boolean[] visited) {
		visited[v] = true;
		System.out.println("visiting " + adjLists[v].name);

		for (Neighbor nbr = adjLists[v].adjList; nbr != null; nbr = nbr.next) {
			if (!visited[nbr.vertexNum]) {
				System.out.println(adjLists[v].name + "--" + adjLists[nbr.vertexNum].name);
				dfs(nbr.vertexNum, visited);
			}
		}
	}

	public void dfs() {
		boolean[] visited = new boolean[adjLists.length];

		for (int v = 0; v < visited.length; v++) {
			if (!visited[v]) {
				System.out.println("Starting at " + adjLists[v].name);
				dfs(v, visited);
			}
		}
	}

	private void bfs(int start, boolean[] visited, Queue<Integer> queue) {
		visited[start] = true;
		System.out.println("visiting " + adjLists[start].name);
		queue.add(start);

		while (!queue.isEmpty()) {
			int v = queue.poll();
			for (Neighbor nbr = adjLists[v].adjList; nbr != null; nbr = nbr.next) {
				int vnum = nbr.vertexNum;
				if (!visited[vnum]) {
					System.out.println("visiting "+adjLists[vnum].name);
					visited[vnum] = true;
					queue.add(vnum);
				}
			}
		}
	}
	
	public void bfs(){
		Queue<Integer> queue=new LinkedList<>();
		boolean[] visited=new boolean[adjLists.length];
		
		for(int v=0;v<visited.length;v++){
			if(!visited[v])
				bfs(v,visited,queue); 
		}
		
	}

}
