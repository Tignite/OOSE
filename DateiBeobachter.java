import java.io.File;
public class DateiBeobachter extends Thread implements Runnable {

	private File fp;
	private long modifiedTime;
	
	public DateiBeobachter(String pfad){
		this.fp = new File(pfad);
		modifiedTime = fp.lastModified();
	}
	public DateiBeobachter(java.io.File datei){
		this.fp = datei;
		modifiedTime = fp.lastModified();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try{
			while(true){
				if(fp.lastModified() != modifiedTime) {
					System.out.println("Datei wurde geändert!");
					modifiedTime = fp.lastModified();
				}
				else {
					System.out.println(fp.getName());
				}
				sleep(500);
			}
		}
		catch(InterruptedException e){
			System.out.println(e);
		}
	}

}
