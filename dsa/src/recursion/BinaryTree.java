package recursion;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
	private TreeNode root;

	private class TreeNode {
		private TreeNode left;
		private TreeNode right;
		private int data;

		public TreeNode(int data) {
			this.data = data;
		}
	}

	public BinaryTree() {
		this.root = null;
	}

	public void createBinaryTree() {

		TreeNode first = new TreeNode(1);
		TreeNode second = new TreeNode(2);
		TreeNode third = new TreeNode(3);
		TreeNode fourth = new TreeNode(4);
		TreeNode fifth = new TreeNode(5);
		TreeNode sixth = new TreeNode(6);
		TreeNode seventh = new TreeNode(7);

		root = first;
		first.left = second;
		first.right = third;
		second.left = fourth;
		second.right = fifth;
		third.left = sixth;
		third.right = seventh;

	}

	public void preOrder(TreeNode root) {
		if (root == null) {
			return;
		}

		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}

	public void inOrder(TreeNode root) {
		if (root == null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}

	public void postOrder(TreeNode root) {
		if (root == null) {
			return;
		}

		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + " ");
	}

	private void printLevel(TreeNode root, int level) {
		if (root == null) {
			return;
		}
		if (level == 0) {
			System.out.print(root.data + " ");
		} else if (level > 0) {
			printLevel(root.left, level - 1);
			printLevel(root.right, level - 1);
		}
	}

	

	public int findMax() {
		return findMax(root);
	}
	public int findMax(TreeNode root) {
		if (root == null) return Integer.MIN_VALUE;
		int result = root.data;
		int left = findMax(root.left);
		int right = findMax(root.right);
		if (left > result) result = left;
		if (right > result) result = right;
		return result;
	}

	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		bt.createBinaryTree();
	System.out.println(	bt.findMax());;
		 bt.printLevel(bt.root, 1);
	//	bt.levelOrder();
//		bt.preOrder(bt.root);
//		bt.inOrder(bt.root);
//		bt.postOrder(bt.root);
	}
}