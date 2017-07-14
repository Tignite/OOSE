package tree;

import java.util.ArrayList;

public class Tree<T> {
	protected Node<T> root;
	//Standard Konstruktoren
	public Tree(){
		root = null;
	}
	public Tree(T data){
		root = new Node<T>(data);
	}
	public Tree(Node<T> data){
		root = data;
	}
	//Weitere Konstruktoren
	public Tree(ArrayList<T> dataList){
		add(dataList);
	}
	public Tree(T[] dataList){
		add(dataList);
	}
	//Test auf leeren Baum
	public boolean isEmpty(){
		return (root == null);
	}
	//Postorder-Durchlauf mit bearbeitung von action()
	public void postorder(NodeActionInterface ai){
		if(root != null){
			Tree<T> leftTree = new Tree<T>(root.leftChild);
			Tree<T> rightTree = new Tree<T>(root.rightChild);
			leftTree.postorder(ai);
			rightTree.postorder(ai);
			ai.action(root);
		}
	}
	//Postorder mit Hilfsfunktion statt Rekursion
	public void postorderNonrekursiv(NodeActionInterface ai){
		if(root != null){
			postorderNode(root, ai);
		}
	}
	//Hilfsfunktion
	private void postorderNode(Node<T> node, NodeActionInterface ai){
		if(node == null) return;
		postorderNode(node.leftChild, ai);
		postorderNode(node.rightChild, ai);
		ai.action(node);
	}
	//Levelorder mit Arraylist statt Queue, Prinzip aber das selbe
	public void levelorder(NodeActionInterface ai){
		if(root != null){
			ArrayList<Node<T>> al = new ArrayList<Node<T>>();
			al.add(root);
			int counter = 0;
			while(counter < al.size()){
				Node<T> buffer = al.get(counter);
				ai.action(buffer);
				if(buffer.leftChild != null) al.add(buffer.leftChild);
				if(buffer.rightChild != null) al.add(buffer.rightChild);
				counter++;
			}
		}
	}
	
	//Zusatz zum Hinzufügen von einzelnen oder gruppierten Daten
	public void add(T data){
		if(data == null) return;
		if(root == null) root = new Node<T>(data);
		else{
			ArrayList<Node<T>> al = new ArrayList<Node<T>>();
			al.add(root);
			int counter = 0;
			boolean done = false;
			while(done == false && counter < al.size()){
				Node<T> buffer = al.get(counter);
				if(buffer.add(data) == true){
					done = true;
				}
				else {
					al.add(buffer.leftChild);
					al.add(buffer.rightChild);
					counter++;
				}
			}
		}
	}
	//Arrays an per Schleife an add() übergeben
	public void add(ArrayList<T> dataList){
		for(T x:dataList){
			add(x);
		}
	}
	public void add(T[] dataList){
		for(T x:dataList){
			add(x);
		}
	}
}
