package stopwatch;

/**
 * add double primitive from an array.
 * @author Phanuwatch Luangpradit
 *
 */
public class SumDoublePrimitive implements Runnable{

	private double[] values;
	private final int ARRAY_SIZE = 500000;
	private double sum = 0.0;
	private int num;
	
	/**
	 * Create array of values to add number.
	 * @param num is how many times you add number.
	 */
	public SumDoublePrimitive(int num){
		this.num = num;
		values = new double[ARRAY_SIZE];
		for(int i=0; i<ARRAY_SIZE; i++) values[i] = i+1;
	}
	
	/**
	 * Sum all the number in array.
	 */
	@Override
	public void run(){
		for(int count=0, i=0; count<num; count++, i++) {
			if (i >= values.length) i = 0;
			sum = sum + values[i];
		}
	}
	
	/**
	 * print out the information.
	 */
	@Override
	public String toString(){
		return String.format("Sum array of double primitives with count=%,d\n", num) + "sum = "+ sum;
	}
}
