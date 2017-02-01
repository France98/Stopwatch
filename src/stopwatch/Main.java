package stopwatch;

/**
 * Run the Stopwatch by using Runnable.
 * @author Phanuwatch Luangpradit
 *
 */
public class Main {
	
	/**
	 * Run the tasks.
	 */
	public static void main(String[] args) {
		TaskTimer tasktimer = new TaskTimer();
		tasktimer.measureAndPrint(new AppendString(50000));
		tasktimer.measureAndPrint(new AppendString(100000));
		tasktimer.measureAndPrint(new AppendStringBuilder(100000));
		int num = 1000000000;
		tasktimer.measureAndPrint(new SumDoublePrimitive(num));
		tasktimer.measureAndPrint(new SumDoubleObject(num));
		tasktimer.measureAndPrint(new SumBigDecimal(num));
	}
}
