package graphs;
public class UndirectedGraph {
 int[][] adjMatrix;
 
 public UndirectedGraph(int nodes) {
	 this.adjMatrix=new int[nodes][nodes];
 }
 public void addEdge(int u,int v) {
	 this.adjMatrix[u][v]=1;
	 this.adjMatrix[v][u]=1;
 }
	public static void main(String[] args) {
		UndirectedGraph un=new UndirectedGraph(4);
		un.addEdge(0, 1);
		un.addEdge(1, 2);
		un.addEdge(2, 3);
		un.addEdge(3, 0);
		
	}
}