import java.util.concurrent.*;
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
	
	private int sheepCount =0;
	private void incrementAndReport(){
		System.out.print((++sheepCount)+ " " );
	}
	public static void main (String ...z ) {
		ExecutorService service =null;

		try {

			service = Executors.newFixedThreadPool(20);
			var manager = new ConcurrencyPoolDemo ();
			
			//Runnable lambda = manager :: incrementAndReport;
			for (int i=0 ; i< 30; i++)
				service.submit( ()-> manager.incrementAndReport());
				//service.submit( manager:: incrementAndReport);
				//service.submit( lambda);
		}finally {
			if (service !=null ) service.shutdown();
		}
	
	}

}
