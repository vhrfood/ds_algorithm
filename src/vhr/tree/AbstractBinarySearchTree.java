package vhr.tree;

public abstract class AbstractBinarySearchTree<T> implements BinaryTree<T> {

	@Override
	public void inorderTraversal(TreeNode<T> root) {
		// TODO Auto-generated method stub

	}

	@Override
	public void postorderTraversal(TreeNode<T> root) {
		// TODO Auto-generated method stub

	}

	@Override
	public void preorderTraversal(TreeNode<T> root) {
		if (root == null) {
			return;
		}
		System.out.println(root.getData());
		preorderTraversal(root.getLeft());
		preorderTraversal(root.getRight());

	}

	@Override
	public void levelorderTraversal(TreeNode<T> root) {
		// TODO Auto-generated method stub

	}

	public abstract TreeNode<T> addNode(TreeNode<T> root, T data);

	public abstract void removeNode(TreeNode<T> root, T data);

}
