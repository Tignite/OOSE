package tree;

public class Node<T> {
	protected T data;
	protected Node<T> leftChild;
	protected Node<T> rightChild;

	public Node(){
		this(null, null, null);
	}
	public Node(T data){
		this(data, null, null);
	}
	public Node(T data, Node<T> leftChild){
		this(data, leftChild, null);
	}
	public Node(T data, Node<T> leftChild, Node<T> rightChild){
		this.data = data;
		this.leftChild = leftChild;
		this.rightChild = rightChild;
	}
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append(data);
		return sb.toString();
	}
	public boolean add(T data){
		if(data == null) return false;
		if(this.data == null){
			this.data = data;
			return true;
		}
		else if(leftChild == null){
			leftChild = new Node<T>(data);
			return true;
		}
		else if(rightChild == null){
			rightChild = new Node<T>(data);
			return true;
		}
		return false;
	}
}
