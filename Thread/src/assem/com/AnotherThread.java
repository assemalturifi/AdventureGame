package assem.com;

public class AnotherThread extends Thread {

	@Override
	public void run() {
		System.out.println("Hello from another thread");
		try {
			Thread.sleep(5000);
			
			
		}catch(InterruptedException e) {
			System.out.println("Another thread woke me up");
			return;
			
	}
		System.out.println("Three seconds have passed and im awake");
	
	
	}
	
	

}
