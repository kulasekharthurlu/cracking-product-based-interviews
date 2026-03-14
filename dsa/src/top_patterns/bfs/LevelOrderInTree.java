package top_patterns.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderInTree {
	public static void main(String[] args) {
		LevelOrderInTree cc = new LevelOrderInTree();
		TreeNode root = new TreeNode(1);
		TreeNode second = new TreeNode(2);
		TreeNode third = new TreeNode(3);
		TreeNode fourth = new TreeNode(4);
		TreeNode fifth = new TreeNode(5);
		TreeNode sixth = new TreeNode(6);
		TreeNode seventh = new TreeNode(7);
		root.left = second;
		root.right = third;
		second.left = fourth;
		second.right = fifth;
		third.left = sixth;
		third.right = seventh;
		cc.bfs(root);
	}

	public void bfs(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		while (!queue.isEmpty()) {
			TreeNode current = queue.poll();
			System.out.print(current.data);
			if (current.left != null) {
				queue.offer(current.left);
			}
			if (current.right != null) {
				queue.offer(current.right);
			}
		}
	}

}

class TreeNode {
	int data;
	TreeNode left;
	TreeNode right;

	public TreeNode(int data) {
		this.data = data;

	}

	@Override
	public String toString() {
		return "TreeNode [data=" + data + ", left=" + left + ", right=" + right + "]";
	}

}