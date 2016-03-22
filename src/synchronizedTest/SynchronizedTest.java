package synchronizedTest;

public class SynchronizedTest implements Runnable {
	
	static int count;
	private final int id;
	
	public SynchronizedTest() {
		// TODO Auto-generated constructor stub
		id=count++;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (this) {
			System.out.println("I am : "+id);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SynchronizedTest st=new SynchronizedTest();
		SynchronizedTest st2=new SynchronizedTest();
		SynchronizedTest st3=new SynchronizedTest();
		Thread t=new Thread(st);
		Thread t1=new Thread(st2);
		Thread t3=new Thread(st3);
		t.start();
		t1.start();
		t3.start();
	}

}
