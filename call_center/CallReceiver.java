
public enum Level {
    JUNIOR, SENIOR, MANAGER;
}
public class CallReceivers extends Employee{
    
    private Level level;
    private boolean available;

    private boolean busy() { available = true; }

    public boolean reveiveCall(final Call call){
       busy();

       free();
    }

    private boolean free() { available = false; }

    public boolean isAvailable() { return available; } 
}

public class Call {
    private int    phoneNumber;
    private String areaCode;
    private String nameOfCustomer;

    public boolean receive(){
    }

    public void forward(final Employee employee){
        employee.receiveCall(employee);
    }
}


public class CallExchange{
    public final Queue<Employee> queueOfReceivers =  new PriorityQueue<>();

    public CallReceiver findAFreeResourse(){
        return queueOfReceivers.stream().filter(CallReceiver::isAvailable).any();
    }
    public CallReceivers patchTheCall(final Call call){
        final CallReceiver callReceiver = queueOfReceivers.get();
        if(callReceiver){
            callReceiver.receiver(call);
        }

        return callReceiver;
    }
}
