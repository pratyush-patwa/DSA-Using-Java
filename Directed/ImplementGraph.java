package Directed;

class ImplementGraph{
	public static void main(String[]args) {
		Graph<Integer> g = new Graph<Integer>();
		g.addEdge(2, 7);
		g.addEdge(2, 15);
		g.addEdge(2, 11);
		g.addEdge(7, 11);
		g.addEdge(7, 9);
		g.addEdge(8, 11);
		g.addEdge(11, 6);
		g.addEdge(6, 9);
		g.addEdge(6, 7);
		g.printGraph();
	}
}