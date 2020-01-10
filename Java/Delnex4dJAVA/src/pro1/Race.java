package pro1;




class Hare implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println(Thread.currentThread().getName()+"");
			try {
				Thread.sleep(40);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
class Tor implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println(Thread.currentThread().getName()+"");
			try {
				Thread.sleep(40);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
public class Race {
	public static void main(String[] args) {
		Hare hare = new Hare();
		Tor t = new Tor();

		Thread hareThread = new Thread(hare);
		Thread torThread = new Thread(t);

		hareThread.start();
		torThread.start();

		while(true) {
			if(!hareThread.isAlive()) {
				System.out.println("Hare Thread Wins");
				break;
			}
			if(!torThread.isAlive()) {
				System.out.println("Tortoise Thread Wins");
				break;
			}
		}

	}

}
