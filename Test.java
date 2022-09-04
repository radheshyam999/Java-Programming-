import java.util.Optional;

public class Test  { 
     public static void main(String[] args) throws Exception { 
        //  ProcessHandle p=ProcessHandle.current();  
        //  long pid=p.pid(); 
        //  System.out.println("The PID of current running JVM instance :"+pid);  
        //  Thread.sleep(100000);  

        // ProcessHandle p=ProcessHandle.current(); 
        //  ProcessHandle.Info info=p.info(); 
        //  System.out.println("Complete Process Inforamtion:\n"+info); 
        //  System.out.println("User: "+info.user().get()); 
        //  System.out.println("Command: "+info.command().get()); 
        //  System.out.println("Start Time: "+info.startInstant().get()); 
        //  System.out.println("Total CPU Time Acquired: "+info.totalCpuDuration().get());

        Optional<ProcessHandle> opt=ProcessHandle.of(7532); 
        ProcessHandle p=opt.get();
        ProcessHandle.Info info=p.info(); 
        System.out.println("Complete Process Inforamtion:\n"+info); 
        System.out.println("User: "+info.user().get());
        System.out.println("Command: "+info.command().get()); 
        System.out.println("Start Time: "+info.startInstant().get());
        System.out.println("Total CPU Time Acquired: "+info.totalCpuDuration().get());

                 




        } 
     } 