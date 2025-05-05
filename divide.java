import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int b=sc.nextInt();
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