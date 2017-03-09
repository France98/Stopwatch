package stopwatch;

/**
 * Use to measure the time in seconds.
 * @author Phanuwatch Luangpradit
 *
 */
public class TaskTimer {

	private Stopwatch timer;
	
	/**
	 * Initialize the new TaskTimer.
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
		System.out.println(runnable.toString());
		timer.stop();
		System.out.printf("Elapsed time %.6f sec\n\n", timer.getElapsed());
	}
}
