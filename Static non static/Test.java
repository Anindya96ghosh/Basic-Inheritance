
public class Test {

	public static void main(String args[])
	
	{
		SubClass subclass=new SubClass();
		 
		System.out.println("The output of non static member is "+subclass.add());
		System.out.println("The output of static member is "+SubClass.sub());
		
	}
}
