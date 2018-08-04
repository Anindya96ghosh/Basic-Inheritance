//Program to demonstrate function overloading

import java.util.*;
public class Test {

	public static void main(String args[])
	{
		Child child=new Child(5,10);
		
		System.out.println("The output of parent class is "+child.add());
		System.out.println("The output of child class is "+child.add(25,10));
	}
	
}
