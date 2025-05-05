import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
	    int a=55;
	    int b=0;
	    try
	    {
	        int result=a/b;
	        System.out.println("The result is"+result);
	    }
	    catch (ArithmeticException ae) 
	    {
            System.out.println("Error: Division by zero is not allowed.");
            System.out.println("Please enter a non-zero value for the denominator.");
        }

	}
}