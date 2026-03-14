package graphs;

import java.util.LinkedList;

public class ConnectedComponents {
	int V = 6;
	LinkedList<Integer>[] adj;

	public void dfs() {
		boolean[] visited = new boolean[V];
		int[] compId = new int[V];
		int count = 0;
		for (int v = 0; v < V; v++) {
			if (!visited[v]) {
				dfs(v, visited, compId, count);
				count++;
			}
		}

	}

	public void dfs(int v, boolean[] visited, int[] compId, int count) {
		visited[v] = true;
		compId[v] = count;
		for (int w : adj[v]) {
			if (!visited[w]) {
				dfs(w, visited, compId, count);
			}
		}
	}
}