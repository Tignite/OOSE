
public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleList test = new DoubleList();
		//System.out.print(test);
		test.add(42);
		test.add(12);
		test.add(7);
		test.insertFirst(1.0);
		test.insertFirst(420.0);
		System.out.print(test);
		test.remove(2);
		test.remove(0);
		test.remove(1);
		System.out.println(test.get(0));
		System.out.print(test);
	}

}
