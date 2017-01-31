package stopwatch;

/**
 * A Stopwatch that measures elapsed time between a starting time and stopping
 * time, or until the present time.
 * 
 * @author Phanuwatch Luangpradit
 * @version 27/01/2017
 */
public class Stopwatch {

	/** constant for converting nanoseconds to seconds. */
	private static final double NANOSECONDS = 1.0E-9;
	/** time that the stopwatch was started, in nanoseconds. */
	private long startTime = 0;
	private boolean running;
	private long stoptime;
	
	/** Start the stopwatch if it is not already running. */
	public void start() {
		if(running == false){
			this.startTime = System.nanoTime();
			running = true;
		}
	}
	/**Stop the stopwatch if it is running. */
	public void stop(){
		if(running == true){
			this.stoptime = System.nanoTime();	
			running = false;
		}
	}
	
	/**
	 * returns true if the stopwatch is running, false if stopwatch is stopped.
	 * @return true or false
	 */
	public boolean isRunning(){
		return running;
	}
	
	/**
	 * return the elapsed time in seconds with decimal. 
	 * @return the total time that stopwatch use.
	 */
	public double getElapsed(){
		if(running == true){
			return (System.nanoTime() - startTime) * NANOSECONDS;
		}
		else{
			return (stoptime - startTime) * NANOSECONDS;
		}
	}
}
