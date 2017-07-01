import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyStack<T> implements MStack<T>{
	private List<T> pStack = new ArrayList<T>();
	private ArrayList<List<T>> stackArray;
	private int maxSize; //2.147.483.647
	protected int stackSize = 0;
	
	public MyStack(){
		//maxSize = Integer.MAX_VALUE;
		maxSize = 3;
		stackArray = new ArrayList<List<T>>();
	}
	
	@Override
	public T myPop() {
		// TODO Auto-generated method stub
		T data = null;
		if(!pStack.isEmpty()){
			int currentSize = pStack.size() - 1;
			data = pStack.get(currentSize);
			pStack.remove(currentSize);
			System.out.println(data);
		}
		else{
			if(stackSize > 0){
				sizeReduce();
				return myPop();
			}
		}
		return data;
	}

	@Override
	public boolean myPush(T data) {
		// TODO Auto-generated method stub
		if(pStack.size() < maxSize){
			pStack.add(data);
		}
		else{
			sizeExtend();
			return myPush(data);
		}
		return true;
	}

	@Override
	public void sizeExtend() {
		// TODO Auto-generated method stub
		stackArray.add(pStack);
		pStack = new ArrayList<T>();
		stackSize += 1;
	}

	@Override
	public void sizeReduce() {
		// TODO Auto-generated method stub
		if(stackSize > 0){ //private wegen interface nicht möglich..
			stackSize -= 1;
			pStack = stackArray.get(stackSize);
			stackArray.remove(stackSize);
		}
	}

	

	@Override
	public boolean add(T e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void add(int index, T element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean addAll(Collection<? extends T> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection<? extends T> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator<T> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<T> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T set(int index, T element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<T> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
