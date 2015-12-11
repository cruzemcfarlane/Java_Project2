public class Bank extends Branch
{
    private static int numCustomer;
    private static int numEmployee;
    
    private int customer;
    private int employee;
    
    public Bank(int regNum, String name, String location, int branchNum, int contact, int customer, int employee)
    {
        super(regNum, name, "Bank", location, branchNum, contact);
        
        this.customer = customer;
        this.employee = employee;
        
        numCustomer++;
        numEmployee++;
        
        Organization.setCountBranch();
    }
    
    public static int getNumCustomer()
    {
        return numCustomer;
    }
    
    public static int getNumEmployee()
    {
        return numEmployee;
    }
    
    public String toString()
    {
        return super.toString()
               + "\nNo. Customer(s): " + customer
               + "\nNo. Employee: " + employee;
    }
}