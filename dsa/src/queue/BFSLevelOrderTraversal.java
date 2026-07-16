package queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFSLevelOrderTraversal {
	public List<List<Integer>> levelOrder(TreeNode root) {

		java.util.List<List<Integer>> res = new ArrayList<>();

		if (root == null)
			return res;

		Queue<TreeNode> q = new LinkedList<>();
		q.offer(root);

		while (!q.isEmpty()) {

			int size = q.size();
			List<Integer> level = new ArrayList<>();

			for (int i = 0; i < size; i++) {

				TreeNode node = q.poll();

				level.add(node.val);

				if (node.left != null)
					q.offer(node.left);

				if (node.right != null)
					q.offer(node.right);
			}

			res.add(level);
		}

		return res;
	}
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	public TreeNode(int data) {
		this.val = data;

	}

	@Override
	public String toString() {
		return "TreeNode [data=" + val + ", left=" + left + ", right=" + right + "]";
	}

}