import java.util.ArrayList;
import java.util.List;

public class PartialMultiplyThread extends Thread{
	private int partNumber;
	private int size;
	private int parts;
	private BigMatrix host;
	private BigMatrix ref;
	private BigMatrix result;
	ArrayList<List<Double>> rowPart;
	
	public PartialMultiplyThread(int partNumber, int parts, BigMatrix host, BigMatrix ref, BigMatrix result){
		this.partNumber = partNumber;
		this.size = host.size();
		this.parts = parts;
		this.host = host;
		this.ref = ref;
		this.result = result;
		rowPart = new ArrayList<List<Double>>(size/parts);
		for(int i = 0; i < size/parts; i++){
			rowPart.add(new ArrayList<Double>(size));
		}
	}
	public ArrayList<List<Double>> getPart(){
		return rowPart;
	}
	public void run(){
		int startRow = (size/parts * (1 + partNumber)) - 1;
		for(int rows = startRow; rows < startRow + size/parts; rows++){
			for(int cols = 0; cols < size; cols++){
				double sum = 0;
				for(int entry = 0; entry < size; entry++){
					sum += host.get(rows, entry) * ref.get(entry, cols);
				}
				result.set(rows, cols, sum);
			}
		}
	}
}
