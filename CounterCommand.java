
public class CounterCommand extends Thread implements Runnable {
	
	@Override
	public void run(){
		for(int i = 0; i < 10; i++){
			System.out.println(i);
			try{
				int sleepTimer = new java.util.Random().nextInt(1000);
				sleep(sleepTimer);
			}
			catch(InterruptedException e){
				System.out.println("Pause");
			}
		}
	}
}
