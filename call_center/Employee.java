public class Employee{
    private final String name;
    private final String address;
    private Employee supervisor;

    public String getName(final String name){
        this.name = name;
    }

    public String getAddress(final String address){
        this.address = address;
    }

    public String getSupervisior(final String supervisor){
        this.supervisor = supervisor;
    }
}
