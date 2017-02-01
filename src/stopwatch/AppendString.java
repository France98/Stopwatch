package stopwatch;

/**
 * Append chars to a String.
 * @author Phanuwatch Luangpradit
 *
 */
public class AppendString implements Runnable {
	private final char CHAR = 'a';
	private int num;
	private String result = "";
	
	/**
	 * AppendString with size.
	 * @param num is amount of chars.
	 */
	public AppendString(int num){
		this.num = num;
		this.result = "";
	}
	
	/**
	 * Add chars to String.
	 */
	@Override
	public void run(){
		int k = 0;
		while(k++ < num){
			this.result = this.result + CHAR;
		}
	}
	
	/**
	 * print out the information.
	 */
	@Override
	public String toString(){
		return String.format("Append %,d chars to String\n", this.num) + 
				String.format("final string length = %d", result.length());
	}
}
