package stopwatch;

public class TaskTimer {

	public static void measureAndPrint(Runnable runnable){
		
		Stopwatch stopwatch = new Stopwatch();
		stopwatch.start();
		runnable.run();
		stopwatch.stop();
		System.out.println(runnable.toString());
		System.out.printf("Elapsed time %.6f sec\n\n", stopwatch.getElapsed());
	}
	
	
}
