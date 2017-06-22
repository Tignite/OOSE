import java.util.GregorianCalendar;

public class DateCommand extends Thread implements Runnable{

	@Override
	public void run() {
		GregorianCalendar d = new GregorianCalendar();
		for(int i = 0; i < 10; i++){
			System.out.println(d.get(GregorianCalendar.DAY_OF_MONTH) + "." + d.get(GregorianCalendar.MONTH) 
			+ "." + d.get(GregorianCalendar.YEAR));
			try{
				int sleepTimer = new java.util.Random().nextInt(1000);
				sleep(sleepTimer);
			}
			catch(InterruptedException e){
				System.out.println(e);
			}			
		}
	}
}
