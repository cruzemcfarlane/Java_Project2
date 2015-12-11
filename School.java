public class School extends Branch
{
    private static int numStudent;
    private static int numStaff;
    
    private int student;
    private int staff;
    
    public School(int regNum, String name, String location, int branchNum, int contact, int student, int staff)
    {          
        super(regNum, name, "School", location, branchNum, contact);
        
        this.student = student;
        this.staff = staff;
        
        numStudent++;
        numStaff++;
        
        Organization.setCountSchool();
    }
    
    public static int getNumStudent()
    {
        return numStudent;
    }
    
    public static int getNumStaff()
    {
        return numStaff;
    }
    
    public String toString()
    {
        return super.toString()
               + "\nNo. Student(s): " + student
               + "\nNo. Staff: " + staff;
    }
}