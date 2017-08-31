package JavaLearning.OopsLearning;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class empTest{
	
	public static void main (String [] args)
	{
		emp A1= new emp();
		A1.display();
		System.out.println("\n");
		emp A2= new emp(42642, "Amit", 6778);
		A2.display();
		
	}
}