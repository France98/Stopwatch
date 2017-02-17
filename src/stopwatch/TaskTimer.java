package stopwatch;

/**
 * Count the time of runnable tasks.
 * @author Phanuwatch Luangpradit
 *
 */
public class TaskTimer {

	private Stopwatch timer;
	
	/**
	 * Use Stopwatch.
	 */
	public TaskTimer(){
		timer = new Stopwatch();
	}
	
	/**
	 * Measure and print the result of program.
	 * @param runnable task to measure the time.
	 */
	public void measureAndPrint(Runnable runnable){
		timer.start();
		runnable.run();
		timer.stop();
		System.out.println(runnable.toString());
		System.out.printf("Elapsed time %.6f sec\n\n", timer.getElapsed());
	}
}
