package stopwatch;

public class SumDoublePrimitive {

	private double[] values;
	private final int ARRAY_SIZE = 500000;
	private double sum = 0.0;
	private int num;
	
	public SumDoublePrimitive(int num){
		this.num = num;
		values = new double[ARRAY_SIZE];
		for(int i=0; i<ARRAY_SIZE; i++) values[i] = i+1;
	}
	
	public void run(){
		for(int count=0, i=0; count<num; count++, i++) {
			if (i >= values.length) i = 0;
			sum = sum + values[i];
		}
	}
	
	public String toString(){
		return String.format("Sum array of double primitives with count=%,d\n", num);
	}
}
