import java.util.List;

public interface MStack<T> extends List<T> {
	public T myPop();
	public boolean myPush(T data);
}
