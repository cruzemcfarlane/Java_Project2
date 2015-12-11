import java.util.*;

public abstract class Organization 
{
    protected int regNum;
    protected String name;
              
    private String type;
    
    protected static int countSchool;    
    protected static int countBranch;
    
    protected String location;
    protected int branchNum;
    
    protected static Branch[] arr = new Branch[5];
    
    public Organization(int regNum, String name, String type)
    {
        this.regNum = regNum;
        this.name = name;
        this.type = type;
    }
    
    public static Branch[] addBranch(Branch[] array, Branch obj)
    {
        ArrayList<Branch> branch = new ArrayList<Branch>();
        
        for (int b = 0; array.length > b; b++)
        {
            branch.add(array[b]);
        }
        
        branch.add(obj);
                
        arr = branch.toArray(new Branch[branch.size()]);
        return arr;
    }
    
    public boolean equals(int reg, String local, int branNum)
    {
        if(regNum == reg && location.equalsIgnoreCase(local) && branchNum == branNum)
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
        return "Reg. No: " + regNum
               + "\nName: " + name
               + "\nType: " + type;
    }
    
    public static void setCountSchool()
    {
        countSchool++;
    }
    
    public static void setCountBranch()
    {
        countBranch++;
    }
        
    public int compareTo(int regNum)
    {
        int val = 0;
        
        if (this.regNum < regNum)
        {
            return val = 1;
        }
                
        else if(this.regNum > regNum)
        {
            return val = -1;
        }
        
        return val;
    }    
}