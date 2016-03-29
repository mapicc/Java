package volatileTest;

public class VolatileTest extends Thread {
	private static boolean flags=false;
	
	public void run(){
		while(!flags){
			System.out.println(flags);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		VolatileTest t=new VolatileTest();
		t.start();
		t.sleep(10);
		flags=true;
	}

}
