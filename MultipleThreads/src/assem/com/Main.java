package assem.com;
public class Main {
	public static void main(String[] args) {
		
	}

}
class CountDown{
	public void doCountDown() {
		String color;
		
		switch(Thread.currentThread().getName()) {
		case "Thread 1":
			color=ThreadColor.ANSI_CYAN;
			break;
		case "Thread 2":
			color=ThreadColor.ANSI_PURPLE;
			break;
			default:
				color=ThreadColor.ANSI_GREEN;
	
		}
		for(int i=10;i>0;i--) {
			System.out.println(color+Thread.currentThread().getName()+": i="+i);
		}
	}
}
class CountDownThread extends Thread {
	private CountDown threadCountDown;
	
	public CountDownThread(CountDown countdown) {
		threadCountDown=countdown;
	}
	
}
