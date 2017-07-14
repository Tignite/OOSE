package tree;

public class NodePrinter implements NodeActionInterface {
	@Override
	public void action(Node<?> n) {
		// TODO Auto-generated method stub
		System.out.print(n + " ");
	}
}
