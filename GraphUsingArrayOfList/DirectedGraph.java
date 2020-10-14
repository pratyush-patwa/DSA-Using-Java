package GraphUsingArrayOfList;

import java.util.*;

public class DirectedGraph {
	
	private int v; //Number of Vertices
	private LinkedList<Integer> adj [];  // Array Of LinkedList is used as adjency List 
	
	//Constructor 
	@SuppressWarnings("unchecked")
	DirectedGraph(int v){
		this.v = v;
		adj = new LinkedList[v];
		for(int i =0; i<v; i++) {
			adj[i] = new LinkedList<Integer>();
		}
	}
	
	//Method to add an edge to the graph 
	void addEdge(int v , int u) {
		adj[v].add(u);
	}
	
	// BFS Method
	void BreadthFirstSearch(int s) {
		
		boolean [] visited = new boolean[v];
		
		LinkedList<Integer> queue = new LinkedList<Integer>();
		
		visited [s] = true;
		queue.add(s); 
		
		while(queue.size() !=0) {
			s = queue.poll();
			System.out.print(s + "----->");
			
			Iterator <Integer> i =  adj[s].listIterator();
			while(i.hasNext()) {
				
				int n = i.next();
				if(!visited[n]) {
					visited[n] = true;
					queue.add(n);
				}
			}			
		}
	}
	
	
	void DepthFirstSearch(int s, boolean visited[]) {
		
		visited[s] = true;
		System.out.print(s +"---->");
		
		Iterator <Integer> i = adj[s].listIterator();
		
		while(i.hasNext()) {
			int n = i.next();
			if(!visited[n]) {
				DepthFirstSearch(n, visited);
			}
		}
	}
	void DFS(int s) 
	{ 
		boolean visited[] = new boolean[v]; 
		DepthFirstSearch(s, visited); 
	} 
	
}
