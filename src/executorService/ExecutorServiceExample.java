package executorService;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		executorService.execute(new Runnable(){
			public void run(){
				System.out.println(Thread.currentThread().getName() + "  execute method");
			}
		});
		Future<?> future = executorService.submit(new Runnable(){
			public void run(){
				System.out.print(Thread.currentThread().getName() + "  submit method");
			}
		});
		try {
			System.out.println("future result : " + future.get());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Future<?> future2 = executorService.submit(new Callable<Object>() {
			public Object call() throws Exception{
				System.out.print(Thread.currentThread().getName() + "callable submit method");
				return "callable finish !";
			}
		});
		try {
			System.out.println("future2 result : " + future2.get());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		executorService.shutdown();
	}

}
