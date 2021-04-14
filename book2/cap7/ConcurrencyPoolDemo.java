import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.Callable;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Supplier;
final class ConcurrencyPoolDemo{
	
	/**
	 * A thread pool es un grupo de threads pre-instanciados y reutilizables
	 * que estan disponibles para realizar cierta tarea
	 *
	 * La diferencia entre a singleThread y  un pooled-thread executor es que sucede cuando
	 * una tarea ya se encuentra ejecutandose
	 * En un single thread executor, este esperará por el thread hasta que se encuentre nuevmente disponible
	 * antes de seguir con la siguiente tarea
	 * En un pooled-thread executor podrá ejecutar la siguiente tarea de forma concurrente, si se quedará
	 * agotado de threads disponibles, la tarea esperará hasta que se libere un thread
	 * 
	 * */
	
	private static int sheepCount =0;
	private void incrementAndReport(){
		// el siguiente bloque de condigo si compila sin embargo, el resultado no es el esperado
		// synchronized (new ConcurrencyPoolDemo()){
		// 	System.out.print((++sheepCount)+ " " );
		// }
		//
		synchronized (this){
			System.out.print((++sheepCount)+ " " );
		}
	}
	public static void main (String ...z ) throws InterruptedException {
		ExecutorService service =null;

		try {

			service = Executors.newFixedThreadPool(20);
			var manager = new ConcurrencyPoolDemo ();
			
			Runnable lambda = manager :: incrementAndReport;
			for (int i=0 ; i< 30; i++)
			//service.submit( ()-> manager.incrementAndReport());
			//service.submit( manager:: incrementAndReport);
			service.submit( lambda);
		}finally {
			if (service !=null ) service.shutdown();
		}
		
		/**
		 * Lock Framework
		 * The Lock interface is similar to using the synchronized keyword
		 * Instead of synchronizing on any Object, we can lock on an object that implements the Lock interface
		 */
		System.out.println("");	
		System.out.println("****ReentrantLock****");	
		Lock lock = new ReentrantLock();

		new Thread(()-> printMessage(lock)).start();
		Thread.sleep(2000);
		if (lock.tryLock(20, TimeUnit.SECONDS)) {
			try {
				System.out.println("lock obtenido..ingresando al codigo protegido");	
			} finally {
				lock.unlock();
			}
		} else {
			System.out.println("no se pudo adquirir el lock...realizando otra cosa");	
		}


		/**
		 * CyclicBarrier
		 * The CyclicBarrier toma un valor limite (un numero ) en su constructor que indica
		 * el numero de threads que se deben de esperar.
		 * Cuando cada thread termine, se llama al metodo await del cyclic barrier
		 * 
		*/
		try {
			service = Executors.newFixedThreadPool(4);
			var manager = new ConcurrencyPoolDemo();
			var c1 = new CyclicBarrier(4);
			Supplier<String> supp= ()-> "**** jaulas limpias";
			Runnable runna = () -> System.out.println("**** jaulas limpias");
			//var c2 = new CyclicBarrier(4, supp); --> esto no compila, un cyclicbarrier aceptaq como segundo paremtro un runnable
			var c2 = new CyclicBarrier(4, runna);

			//Callable<?> callable = ()-> manager.realizarTareas(c1, c2); esto no es posbile, un callable debe tener un tipo de retorno 
			Runnable callable = ()-> manager.realizarTareas(c1, c2); 
			for (int i = 0; i < 4; i++) {
				service.submit(callable);
			}
		} finally{
			if (service!=null)  service.shutdown();
		}
	}
	
	public static void printMessage(Lock lock){
		try {
			lock.lock();
			//El codigo a proteger va a partir de aqui
			System.out.println("luego del lock");	
			while (sheepCount<40) {
				System.out.print((++sheepCount)+ " RL" );
			}
		} finally{
			lock.unlock();
		}
	}
	static int lockVariable=0;

	private final static void removeLions (){
		System.out.println("removiendo leones");	
	}
	private final static void removeLions (int num){
		System.out.println(String.format("removiendo %s leones", num) );	
	}
	private void cleanPen(){
		System.out.println(String.format("limpiando la jaula") );	
	}
	private final static void addLions (){
		System.out.println("agregando leones");	
	}
	private final static void addLions (int num){
		System.out.println(String.format("agregando %s leones", num) );	
	}

	public void realizarTareas (CyclicBarrier c1, CyclicBarrier c2){
		try {
			removeLions();
			c1.await();
			cleanPen();
			c2.await();
			addLions();
		} catch (InterruptedException| BrokenBarrierException e) {
			e.printStackTrace();
		}
	}
}