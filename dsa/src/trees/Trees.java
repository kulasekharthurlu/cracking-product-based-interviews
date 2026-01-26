package trees;

public class Trees {

	public static void main(String[] args) {
		Trees t = new Trees();
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
		t.leftView( root);
		t.rightView( root);
	}

	public void leftView(TreeNode root) {

		if(root == null) {
			return;
		}
		System.out.print(root.data);
		leftView(root.left);


	}

	public void rightView(TreeNode root) {

		if(root == null) {
			return;
		}
		System.out.print(root.data);
		leftView(root.right);


	}

}

class TreeNode{
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