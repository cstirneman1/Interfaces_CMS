
public class Process implements Priority, Comparable<Process>{

	//variables
	private final String processID;
	private int priority;
	
	
	//Constructors
	public Process() {
		
		processID = "";
		setPriority(priority);
	}
	
	public Process(String processID) {
		
		this.processID = processID;
		setPriority(Priority.MIN_PRIORITY);
	}

	
	//getters & setters
	public String getProcessID() {
		return processID;
	}

	@Override
	public void setPriority(int priority) {
		this.priority = priority;
	}

	@Override
	public int getPriority() {
		return priority;
	}

	
	//CompareTo method
	@Override
	public int compareTo(Process o) {
		return Integer.compare(priority, o.priority);
	}
	
	
	@Override
	public String toString() {
		return "Process [processID=" + processID + ", priority=" + priority + "]";
	}
	
}
