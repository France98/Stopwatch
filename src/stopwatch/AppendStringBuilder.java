package stopwatch;

public class AppendStringBuilder implements Runnable {

	private final char CHAR = 'a';
	private int num;
	private StringBuilder builder;
	
	public AppendStringBuilder(int num){
		this.num = num;
		StringBuilder builder = new StringBuilder();
	}
	 
	@Override
	public void run(){
		int k = 0;
		while(k++ < num) {
			builder = builder.append(CHAR);
		}
	}
	@Override
	public String toString(){
		return String.format("Append %.d chars to String\n", num) + 
				String.format("final string length = ", builder.length());
	}
}
