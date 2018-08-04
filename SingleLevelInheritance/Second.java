
//child class extending class'First'
public class Second extends First{

	//Parameterized Constructor
	public Second(int a)
	{
		super(a);
		
	}
	private int no1=3;
	private int no2=4;
	private int ans;
	
	//function to add two numbers
	public int add()
	{
		ans=no1+no2;
		return ans;
	}
	
}
