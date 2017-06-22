
public class DoubleList {
	private DoubleNode head;

	public DoubleList(DoubleNode head){
		this.head = head;
	}
	public DoubleList(){
		this(null);
	}
	public String toString(){
		StringBuffer sb = new StringBuffer();
		try{
			sb.append(head.getData());
			DoubleNode buffer = head.getNext();
			while(buffer != null){
				sb.append(";" + buffer.getData());
				buffer = buffer.getNext();
			}
		}
		catch(NullPointerException e){
			sb.append("Leere Liste");
		}
		finally{
			sb.append("\n");
		}
		return sb.toString();
	}
	
	public void add(double d){
		DoubleNode newNode = new DoubleNode(d);
		try{
			DoubleNode buffer = head.getNext();
			if(buffer == null){
				head.setNext(newNode);
			}
			else{
				while(buffer.getNext() != null){
					buffer = buffer.getNext();
				}
				buffer.setNext(newNode);
			}
		}
		catch(NullPointerException e){
			this.head = newNode;
		}
	}
	public void insertFirst(double d){
		DoubleNode newNode = new DoubleNode(d);
		try{
			newNode.setNext(this.head);
		}
		finally{
			this.head = newNode;
		}
	}
	public double get(int i){
		double retVal = 0.0;
		try{
			if(i == 0) return head.getData();
			DoubleNode buffer = head;
			while(i > 0){
				buffer = buffer.getNext();
				i--;
			}
			retVal = buffer.getData();
		}
		catch(NullPointerException e){
			System.out.println("Ungültiger Index für diese Liste");
		}
		return retVal;
	}
	public void remove(int i){
		try{
			if(i == 0) {
				head = head.getNext();
				return;
			}
			DoubleNode buffer = head;
			while(i > 1){
				buffer = buffer.getNext();
				i--;
			}
			buffer.setNext((buffer.getNext()).getNext());
		}
		catch(NullPointerException e){
			System.out.println("Ungültiger Index für diese Liste");
		}
	}
}
