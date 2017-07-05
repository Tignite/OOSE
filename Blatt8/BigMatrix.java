import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BigMatrix {
	private ArrayList<List<Double>> rows;
	private final int size;
	
	public BigMatrix(int size){
		this.size = size;
		rows = new ArrayList<List<Double>>(size);
		for(int i = 0; i < size; i++){
			rows.add(new ArrayList<Double>(size));
		}
	}
	public void randomInit(){
		Random r = new Random();
		for(int rows = 0; rows < size; rows++){
			for(int cols = 0; cols < size; cols++){
				(this.rows.get(rows)).add(r.nextDouble());
			}
		}		
	}
	public String toString(){
		StringBuilder sb = new StringBuilder();
		for(int rows = 0; rows < size; rows++){
			for(int cols = 0; cols < size; cols++){
				sb.append((this.rows.get(rows)).get(cols));
				sb.append("\t");
			}
			sb.append("\n");
		}
		return sb.toString();
	}
	public double get(int row, int col){
		if(row < size && col < size) return rows.get(row).get(col);
		else return 0;
	}
	public int size(){
		return size;
	}
	public BigMatrix add(BigMatrix ref){
		if(size == ref.size()){
			BigMatrix newMatrix = new BigMatrix(size);
			for(int rows = 0; rows < size; rows++){
				for(int cols = 0; cols < size; cols++){
					(newMatrix.rows.get(rows)).add(this.get(rows, cols) + ref.get(rows, cols));
				}
			}
			return newMatrix;
		}
		return null;
	}
	public BigMatrix multiplyST(BigMatrix ref){
		if(size == ref.size()){
			BigMatrix newMatrix = new BigMatrix(size);
			for(int rows = 0; rows < size; rows++){
				for(int cols = 0; cols < size; cols++){
					double sum = 0;
					for(int entry = 0; entry < size; entry++){
						sum += this.get(rows, entry) * ref.get(entry, cols);
					}
					(newMatrix.rows.get(rows)).add(sum);
				}
			}
			return newMatrix;
		}
		return null;
	}
	public BigMatrix  multiplyMT(BigMatrix  ref ){
		return null;
	}
}
