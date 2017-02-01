package stopwatch;

import java.math.BigDecimal;

/**
 * Add BigDecimal objects from an array.
 * @author Phanwuatch Luangpradit
 *
 */
public class SumBigDecimal implements Runnable{

	private final int ARRAY_SIZE = 500000;
	private int num;
	private BigDecimal[] values;
	private BigDecimal sum;
	
	/**
	 * Create array of values to add the number.
	 * @param num is amount of numbers
	 */
	public SumBigDecimal(int num){
		this.num = num;
		values = new BigDecimal[ARRAY_SIZE];
		for(int i=0; i<ARRAY_SIZE; i++) values[i] = new BigDecimal(i+1);
	}
	
	/**
	 * Sum all the number in array.
	 */
	@Override
	public void run(){
		sum = new BigDecimal(0.0);
		for(int count=0, i=0; count<num; count++, i++) {
			if (i >= values.length)i = 0;
			sum = sum.add( values[i] );
		}
	}
	
	/**
	 * print out the information.
	 */
	@Override
	public String toString(){
		return String.format("Sum array of BigDecimal with count=%,d\n", num) + "sum = " + sum;
	}
}
