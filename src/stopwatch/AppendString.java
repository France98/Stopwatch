package stopwatch;

public class AppendString implements Runnable {
	private final char CHAR = 'a';
	private int num;
	private String result = "";
	
	
	public AppendString(int num){
		this.num = num;
	}
	
	@Override
	public void run(){
		int k = 0;
		while(k++ < num){
			this.result = this.result + CHAR;
		}
	}
	
	public String toString(){
		return String.format("Append %.d chars to String\n", this.num) + 
				String.format("final string length = ", result.length());
	}
}
