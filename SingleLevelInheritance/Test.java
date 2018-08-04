import java.util.*;
public class Test {
	public static void main(String args[])
	{
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the no of which the factorial is to be found");
	Second second=new Second(scanner.nextInt());
	System.out.println("The output of the child class is"+second.add());
	
	System.out.println("The output of the Parent class is "+second.factorial());
	}
}
