
public class Aufgabe3 {
	class R { }
	class E extends R { }
	class B extends R { }
	class G extends B { }
	class U { }
		public <T> T bar(T x, T y) {
			return x;
		}
		public void run(String[] args) {
			Object o;
			R r = new R();
			E e = new E();
			B b = new B();
			G g = new G();
			U u = new U();
			R[] x;
			E[] y;
			// Stelle 1
			o = bar(new G[2], new U[4]);
			r = e;
			o = r;
			
		}
	
}
