package top_patterns.bfs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class CloneGraph {

	public Node cloneGraph(Node node) {
		if (node == null)
			return null;

		Map<Node, Node> map = new HashMap<>();
		Queue<Node> q = new LinkedList<>();

		q.offer(node);
		map.put(node, new Node(node.val));

		while (!q.isEmpty()) {
			Node cur = q.poll();

			for (Node nei : cur.neighbors) {
				if (!map.containsKey(nei)) {
					map.put(nei, new Node(nei.val));
					q.offer(nei);
				}
				map.get(cur).neighbors.add(map.get(nei));
			}
		}
		return map.get(node);
	}

}

class Node {
	public int val;
	public List<Node> neighbors;

	public Node() {
		val = 0;
		neighbors = new ArrayList<>();
	}

	public Node(int val) {
		this.val = val;
		neighbors = new ArrayList<>();
	}

	public Node(int val, List<Node> neighbors) {
		this.val = val;
		this.neighbors = neighbors;
	}
}