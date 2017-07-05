//import java.util.ArrayList;
//import java.util.List;

public class PartialMultiplyThread extends Thread{
	/*
	private String name;
	private int startRow;
	private int rowsToDo;
	private int size;
	private BigMatrix host;
	private BigMatrix ref;
	ArrayList<List<Double>> part;
	public PartialMultiplyThread(String name, BigMatrix host, BigMatrix ref, int startRow, int rowsToDo, int size){
		part = new ArrayList<List<Double>>(rowsToDo);
		this.name = name;
		this.startRow = startRow;
		this.rowsToDo = rowsToDo;
		this.size = size;
		this.host = host;
		this.ref = ref;
		for(int i = 0; i < rowsToDo; i++){
			part.add(new ArrayList<Double>(size));
		}
	}
	public void run(){
		for(int rows = startRow; rows < startRow + rowsToDo; rows++){
			for(int cols = 0; cols < size; cols++){
				double sum = 0;
				for(int entry = 0; entry < size; entry++){
					sum += this.get(rows, entry) * ref.get(entry, cols);
				}
				(part.get(rows)).add(sum);
			}
		}
	}
		*/
}
