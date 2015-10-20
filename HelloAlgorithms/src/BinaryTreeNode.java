
public class BinaryTreeNode<T extends Comparable<T>> implements Comparable<T> {
	public BinaryTreeNode<T> value;
	public BinaryTreeNode<T> leftNode;
	public BinaryTreeNode<T> rightNode;
	
	@Override
	public int compareTo(T o) {
		return value.compareTo(o);
	}

}
