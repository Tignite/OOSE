/*Aufgabe 2
 * 	1) MyThread extends Thread
 * 		-Memory leak falls start() nicht aufgerufen wird (Java Version < 5)
 *		-ermöglicht das Anpassen des Verhaltens
 * 
 *  2) MyRunnable implements Runnable
 * 		-meist will man das Verhalten jedoch nicht anpassen
 * 		-Trennung von "runner" und "Aufgabe"
 * 		-ermöglicht extends falls benötig
 */
public class ThreadTest {

	public static void main(String[] args) {
		
		/*
		Thread t1 = new Thread(new DateCommand());
		t1.start();
		Thread t2 = new Thread(new CounterCommand());
		t2.start();
		*/	
		Thread t3 = new Thread(new DateiBeobachter("D:\\Data\\JavaWorkspace\\Blatt7\\src\\test.txt"));
		t3.start();
	}

}
