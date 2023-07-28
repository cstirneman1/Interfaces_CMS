
public class Task implements Priority, Comparable<Task>{

	//Enumerated Types
	Status status;
	public enum Status {
        NOT_STARTED, IN_PROCESS, COMPLETE
    }
	
	
	//variables
	private final String name;
	int priority;
	
	
	//constructors
	public Task()
	{
		name = "";
		priority = 0;
		setStatus(Status.NOT_STARTED);
	}
	
	public Task(String name) {
		this.name=name;
		setPriority(Priority.MIN_PRIORITY);
		setStatus(Status.NOT_STARTED);
	}
	
	
	//getters & setters
	public String getName() {
		return name;
	}

	public Status getStatus() {
		return status;
	}
	
	public void setStatus(Status status)
	{
		this.status = status;
	}
	
	@Override
	public void setPriority(int priority)
	{
		this.priority = priority;
	}
	@Override
	public int getPriority() {
		return priority;
	}

	
	//comapreTo method
	@Override
	public int compareTo(Task o) {
		return Integer.compare(this.priority, o.priority);
	}
	
	
	//toString method
	@Override
	public String toString() {
		return "Task [name=" + name + ", priority=" + priority +", "+ "Status: "+status+ "]";
	}
	
}
