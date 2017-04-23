package vhr.tree;

public class IntegerBinarySearchTree extends AbstractBinarySearchTree<Integer> {

	/*
	 * @Override public void add(TreeNode<T> root, String data) {
	 * TreeNode<String> node = new TreeNode<>(data); if(this.root==null){
	 * this.root=node; return; } TreeNode<String> temp=this.root; while(true)
	 * if(data.compareTo(temp.data)>0){ if(temp.left==null){ temp.left=node;
	 * return; } temp=temp.left; }else{ if(temp.right==null){ temp.left=node;
	 * return; } temp=temp.right; }
	 * 
	 * }
	 */

	@Override
	public TreeNode<Integer> addNode(TreeNode<Integer> root, Integer data) {
		TreeNode<Integer> node = new TreeNode<>(data);
		if (root == null) {
			return node;
		}
		TreeNode<Integer> temp = root;
		while (true) {
			if (data > temp.getData()) {
				if (temp.getRight() == null) {
					temp.setRight(node);

				} else {
					temp = temp.getRight();
				}
			} else {
				if (temp.getLeft() == null) {
					temp.setLeft(node);

				} else {
					temp = temp.getRight();
				}
			}
		}

	}

	@Override
	public void removeNode(TreeNode<Integer> root, Integer data) {
		// TODO Auto-generated method stub

	}
}
