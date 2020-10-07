package javatricks;

public class ThreadTrick implements Runnable {
	
	public static void main(String[] args) {
		Thread t =new Thread(new ThreadTrick());
		t.run();
		t.run(); //run method can call twice 
		t.start();
		//t.start(); // can't call start method twice
		
	}

	@Override
	public void run() {
		System.out.println("running run method");
		
	}
}
