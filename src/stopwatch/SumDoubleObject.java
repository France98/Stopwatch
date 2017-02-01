package stopwatch;

/**
 * Add Double objects from an array.
 * @author Phanuwatch Luangpradit
 *
 */
public class SumDoubleObject implements Runnable{

	private int num;
	private Double[] values;
	private final int ARRAY_SIZE = 500000;
	private Double sum; 
	
	/**
	 * Create array of values to add number.
	 * @param num
	 */
	public SumDoubleObject(int num){
		this.num = num;
		Stopwatch timer = new Stopwatch();
		values = new Double[ARRAY_SIZE];
		for(int i=0; i<ARRAY_SIZE; i++) values[i] = new Double(i+1);
	}
	
	/**
	 * Sum all the number in array.
	 */
	@Override
	public void run(){
		sum = new Double(0.0);
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
		return String.format("Sum array of Double objects with count=%,d\n", num) + "sum = "+ sum;
	}
}
