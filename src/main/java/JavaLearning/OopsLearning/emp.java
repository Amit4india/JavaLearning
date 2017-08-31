package JavaLearning.OopsLearning;

/**
 * Hello world!
 *
 */
public class emp 
{
    int empid;
    String empName;
    double empSalary;
// Default constructor
    emp ()
 {
	 empid=77;
	 empName="Nimbus";
	 empSalary=0.0;
	 
}
    emp (int empid, String empName, double empSalary)
    {
    	this.empid=empid;
    	this.empName= empName;
    	this.empSalary= empSalary;
    }
    
    void display()
    {
    	System.out.println("Name of the employee is =" +empName);
    	System.out.print("\nThe salary of employee is=" +empSalary);
    	System.out.print("\nThe employee id of employee is=" +empid);
    	
    }
 }
