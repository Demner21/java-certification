import java.util.concurrent.*;
public class ThreadsDemo{

		/**
		 *-A thread is the smallest unit of execution that can be scheduled by the operating system
		 *-A process is a group of associated threads that execute in the same, shared environment
		 *-Share environment: the threads in the same process share the same memory space and can communicate directly with one another
		 *
		 *
		 * -A system thread is created by the JVM and runs in background of the application
		 * -A user-defined thread is one created by the application developer to accomplish a task
		 *
		 * Concurrency:
		 * the property of executing multiple threads and process at the same time is referred to as concurrency
		 * there are often far more threads than CPU processors available
		 *
		 * Operating system use a thread scheduler, to determine which threads should be currently executing
		 *
		 * */
	private class PrintData implements Runnable{
		@Override
		public void run(){
			for(int i=0;i<3;i++)
				System.out.println("Print the record number: "+i);

		}
	}
	public class ReadInventoryThread extends Thread {
 		  @Override public void run() { // Overrides method in Thread
		      System.out.println("Printing zoo inventory");
       		 }
	}
	
	public static void main (String ...z){	
		//uso de threads --runnable y clase que extiende de Thread
		var a = new ThreadsDemo();
		System.out.println("begin");
		(new Thread(a.new PrintData())).start();
		(a.new ReadInventoryThread()).start();
		(new Thread(a.new PrintData())).start();
		(a.new ReadInventoryThread()).start();
		System.out.println("end");

		//uso de la api concurrency para manejo de threads
		//single thread executor
		//se debe importar java.util.concurrent.*
		ExecutorService service = null;
		Runnable task1= ()-> System.out.println("Printing something");
		Runnable task2= ()->{
			for (int i=0; i<3;i++)
				System.out.println("Printing records: " +i);
		}; 

		try{
			service= Executors.newSingleThreadExecutor();
			System.out.println("begin");
			service.execute(task1);
			service.execute(task2);
			service.execute(task1);
			System.out.println("end");

		}finally{
			if( service !=null ) service.shutdown();
		}
		
		//uso de submit
		// al igual que execute, es usado para completar tareas de manera asincrona
		// retorna un future que es usado para determinar cuando la tarea ha sido completada 
		// ExecutorService posee 5 metodos que deben ser memorizados para el examen:
		// void execute(Runnable command)
		// Future <?> submit(Runnable task)
		// <T> Future <T> submit(Callable <T> task)
		// <T> List<Future<T>> invokeAll (Collection <? extends Callable<T>> task) throws InterruptedException
		// <T> T invokeAny (Collection <? extends Callable<T>> task) throws InterruptedException, ExecutionException



	}
}
