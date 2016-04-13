package gc;

public class FinalizeEscapeGc {
	public static FinalizeEscapeGc Save_hook = null;
	
	public void isAlive(){
		System.out.println("yes,I am still alive !");
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("finalize method exected !");
		FinalizeEscapeGc.Save_hook = this; 
	}
	public static void main(String[] args) throws Throwable{
		// TODO Auto-generated method stub
		Save_hook = new FinalizeEscapeGc();
		Save_hook = null;
		System.gc();
		Thread.sleep(500);
		if(Save_hook != null)
			Save_hook.isAlive();
		else
			System.out.println("no, I am dead !");
		
		Save_hook = null;
		System.gc();
		Thread.sleep(500);
		if(Save_hook != null)
			Save_hook.isAlive();
		else
			System.out.println("no, I am dead !");
	}

}
