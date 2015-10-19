
public class BinaryTreeNode<T extends Comparable<T>> implements Comparable<T> {
	public BinaryTreeNode<T> value;
	
	@Override
	public int compareTo(T o) {
		return value.compareTo(o);
	}

}
