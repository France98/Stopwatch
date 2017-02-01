package stopwatch;

/**
 * Append chars to a StringBuilder.
 * @author Phanuwatch Luangpradit
 *
 */
public class AppendStringBuilder implements Runnable {

	private final char CHAR = 'a';
	private int num;
	private StringBuilder builder;
	
	/**
	 * AppendStringBuilder with size.
	 * @param num is amount of chars.
	 */
	public AppendStringBuilder(int num){
		this.num = num;
		builder = new StringBuilder();
	}
	 /**
	  * Add chars 'a' to a String.
	  */
	@Override
	public void run(){
		int k = 0;
		while(k++ < num) {
			builder = builder.append(CHAR);
		}
	}
	
	/**
	 * print out the information.
	 */
	@Override
	public String toString(){
		return String.format("Append %,d chars to String\n", num) + 
				String.format("final string length = %d", builder.length());
	}
}
