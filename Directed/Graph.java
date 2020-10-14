package Directed;

import java.util.*;

public class Graph<T> {
	/*We declare a Map Of List.. List will Store the adjacent nodes of the Map's Key*/
		Map<T, List<T>> adjList; 
		
	/*Constructor to initialize the Graph that is memory allocated for HashMap */
		public Graph(){
			this.adjList = new HashMap<>();
		}
		
		
	/*Function To add the Edges with Two Nodes one is source node and one is destination node */

	public void addEdge(T src, T dst){
		if(adjList.containsKey(src)){
            List<T> adjacentNodes = adjList.get(src);
            if(adjacentNodes==null){
                adjacentNodes = new LinkedList<>();
	            }
	            adjacentNodes.add(dst);
		}else {
			List<T> adjacentNodes = new LinkedList<>();
            adjacentNodes.add(dst);
            adjList.put(src,adjacentNodes);		
		}
	}
	
	//print the AdjencyList(Graph)
	public void printGraph() {
		for(T node: adjList.keySet()){
            System.out.print(node.toString()+" --> ");
            List<T> adjacentNodes = adjList.get(node);
            if(adjacentNodes!=null) {
                for (T node1 : adjacentNodes) {
                    System.out.print("  "+node1.toString());
                }
            }
            System.out.println();
		}
	}
}
