import java.util.ArrayList;

public class testClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<BigMatrix> ml = new ArrayList<BigMatrix>();
		ArrayList<BigMatrix> mr = new ArrayList<BigMatrix>();
		BigMatrix m = new BigMatrix(300);
		m.randomInit();
		BigMatrix init = null;
		int secs = 0;
		double time = System.currentTimeMillis();
		for(int i = 300; i <= 1000; i += 20){
			init = new BigMatrix(i);
			init.randomInit();
			ml.add(init);
			init = new BigMatrix(i);
			init.randomInit();
			mr.add(init);
		}
		secs = (int) ((System.currentTimeMillis() - time) / 1000 ) % 60;
		System.out.println("Created in " + secs + "s - 36 to do");
		time = System.currentTimeMillis();
		for(int i = 0; i < ml.size(); i++){
			ml.get(i).multiplyST(mr.get(i));
			System.out.print(i + ", ");
		}
		secs = (int) ((System.currentTimeMillis() - time) / 1000 ) % 60;
		System.out.println("Calculated - " + secs);
	}

}
