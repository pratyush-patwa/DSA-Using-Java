package GraphUsingArrayOfList;
import java.util.*;
public class TestDiretedGraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		int e = sc.nextInt();
		DirectedGraph g = new DirectedGraph(v);
		while(e>0) {
			int src = sc.nextInt();
			int dst = sc.nextInt();
			g.addEdge(src, dst);
			e--;
		}
		
		System.out.print("Enter Sorce for traversing" );
		int s = sc.nextInt();
		g.BreadthFirstSearch(s);
		System.out.println();
		g.DFS(s);
		
		sc.close();
	}

}
