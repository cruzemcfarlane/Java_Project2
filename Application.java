import java.util.*;

public class Application
{
    public static void main(String[] args)
    {
        Organization.arr[0] = new Bank(102, "NCB", "Trelawny", 57, 4592300, 105678, 250);
        Organization.arr[1] = new Bank(394, "NCB", "MoBay", 12, 7322854, 107932, 277);
        Organization.arr[2] = new School(123, "Alpha", "Kingston", 44, 1234567, 1500, 88);
        Organization.arr[3] = new School(456, "DC", "Mandeville", 22, 7654321, 1000, 76);
        Organization.arr[4] = new School(456, "DC", "St. Andrew", 11, 4567123, 1700, 101);
        
        
        Scanner scanNum = new Scanner(System.in);
        Scanner scanStr = new Scanner(System.in);
        
        System.out.print("Enter the number branches you want to add: ");
        int bran = scanNum.nextInt();
        
        System.out.print("\nEnter the type of Organization (Bank/School): ");
        String org = scanStr.nextLine();
        
        while(bran > 0)
        {    
            if(org.equalsIgnoreCase("Bank"))
            {
                System.out.print("\nEnter the registration number: ");
                int reg = scanNum.nextInt();
                
                System.out.print("\nEnter the organization name: ");
                String nam = scanStr.nextLine();
                
                System.out.print("\nEnter the location: ");
                String local = scanStr.nextLine();
                
                System.out.print("\nEnter the branch number: ");
                int bNum = scanNum.nextInt();
                
                System.out.print("\nEnter the contact number: ");
                int cNum = scanNum.nextInt();
                
                System.out.print("\nEnter the amount of customer(s): ");
                int cus = scanNum.nextInt();
                
                System.out.print("\nEnter the amount of employee(s): ");
                int emp = scanNum.nextInt();
                                                
                System.out.println();
                
                try
                {
                    for(int i = 0; Organization.arr.length > i; i++)
                    {
                        if((Organization.arr[i].equals(reg, local, bNum))==true)
                        {
                             System.out.println("Already exists\n");
                             System.exit(0);
                        }
                    }
                }
                
                catch(Exception e){}
                
                Branch.addBranch(Organization.arr, (new Bank(reg, nam, local, bNum, cNum, cus, emp)));
            }
            
            
            else if(org.equalsIgnoreCase("School"))
            {
                System.out.print("\nEnter the registration number: ");
                int reg = scanNum.nextInt();
                
                System.out.print("\nEnter the school name: ");
                String nam = scanStr.nextLine();
                
                System.out.print("\nEnter the location: ");
                String local = scanStr.nextLine();
                
                System.out.print("\nEnter the branch number: ");
                int bNum = scanNum.nextInt();
                
                System.out.print("\nEnter the contact number: ");
                int cNum = scanNum.nextInt();
                
                System.out.print("\nEnter the amount of student(s): ");
                int st = scanNum.nextInt();
                
                System.out.print("\nEnter the amount of staff: ");
                int emp = scanNum.nextInt();
                
                System.out.println();
                
                try
                {
                    for(int i = 0; Organization.arr.length > i; i++)
                    {
                        if(Organization.arr[i].equals(reg, local, bNum))
                        {
                             System.out.println("Already exists\n");
                             System.exit(0);
                        }
                    }
                }
                
                catch(Exception e){}
                
                Branch.addBranch(Organization.arr, (new School(reg, nam, local, bNum, cNum, st, emp)));
            }
            
            bran--;
        }
                
        //Sorting.selectionSort((Comparable[])Organization.arr);
        
        for(Branch count: Organization.arr)
        {
            System.out.println(count);
            System.out.println();
        }
        
        System.out.print("\nNo of Schools: " + Organization.countSchool);
        System.out.print("\nNo of Banks: " + Organization.countBranch);
    }
}