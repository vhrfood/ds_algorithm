package vhr.tree;

public interface BinaryTree<T> {

	public void inorderTraversal(TreeNode<T> root);

	public void postorderTraversal(TreeNode<T> root);

	public void preorderTraversal(TreeNode<T> root);

	public void levelorderTraversal(TreeNode<T> root);

}
