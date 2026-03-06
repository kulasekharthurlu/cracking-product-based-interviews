import java.util.Arrays;
import java.util.LinkedList;

public class UndirectedGraphWithList {
	LinkedList<Integer>[] adj;
	public UndirectedGraphWithList(int nodes) {
		this.adj=new LinkedList[nodes];
		for(int i=0;i<nodes;i++) {
			this.adj[i]=new LinkedList<>();
		}
		
	}
	public void addEdge(int u,int v) {
		this.adj[u].add(v);
		this.adj[v].add(u);
	}
	public static void main(String[] args) {
		UndirectedGraphWithList ugl=new UndirectedGraphWithList(4);
		ugl.addEdge(0, 1);
		ugl.addEdge(1, 2);
		ugl.addEdge(2, 3);
		ugl.addEdge(3, 0);
		 
	}

}