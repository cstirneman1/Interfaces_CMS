

public class Application_program2 {

	public static void main(String[] args) {
		//creating task and process objects
		Task task1 = new Task("123");
        Task task2 = new Task("456");

        Process process1 = new Process("555");
        Process process2 = new Process("222");

        System.out.println(task1.toString());
        System.out.println(task2.toString());
        
        System.out.println(process1.toString());
        System.out.println(process2.toString());

        //Test getters & setters
        task1.setPriority(Priority.MIN_PRIORITY);
        task2.setPriority(Priority.MAX_PRIORITY);
        
       System.out.println(task1.getName());
        
        task1.setStatus(Task.Status.IN_PROCESS);
        System.out.println("Task 1 Status: " +task1.getStatus());
        
       System.out.println(task1.toString());
       System.out.println(task2.toString());
       
       
        // Test Comparable method
        System.out.println("Comparing tasks: " + task1.compareTo(task2));
        System.out.println("Comparing processes: " + process1.compareTo(process2));
        
        
        
        
	}

}
