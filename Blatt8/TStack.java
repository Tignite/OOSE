
public class TStack<T> {
	protected T data;
	protected TStack<T> pre;
	
	protected TStack(T data, TStack<T> pre){
		this.data = data;
		this.pre = pre;
	}
	protected TStack(T data){
		this(data, null);
	}
	public String toString(){
		return (new StringBuilder()).append(data).toString();
	}
}
