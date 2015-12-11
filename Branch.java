import java.util.*;

public class Branch extends Organization
{
    protected int contact;
   
    
    public Branch(int regNum, String name, String type, String location, int branchNum, int contact)
    {
        super(regNum, name, type);
        
        this.location = location;
        this.branchNum = branchNum;
        this.contact = contact;
    }
        
    public boolean equals(int branchNum, String location)
    {
        if(this.branchNum == branchNum && this.location.equalsIgnoreCase(location))
        {
            return true;
        }
        
        else
        {
            return false;
        }
    }
    
    public String toString()
    {
        return super.toString()
               + "\nLocation: " + location
               + "\nBranch No: " + branchNum
               + "\nContact: " + contact;
    }    
}
    