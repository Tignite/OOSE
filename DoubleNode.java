
public class DoubleNode {
	private double data;
	private DoubleNode next;
	
	public DoubleNode(double data){
		this.data = data;
		this.next = null;
	}
	public DoubleNode(){
		this(0);
	}
	
	public void setData (double data){
		this.data = data;
	}
	public void setNext (DoubleNode next){
		this.next = next;
	}
	
	public double getData(){
		return this.data;
	}
	public DoubleNode getNext(){
		return this.next;
	}
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append(data);
		return sb.toString();
	}
}
