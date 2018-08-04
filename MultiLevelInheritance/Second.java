//child class extending class'First'
class Second extends First{

	//Parameterized Constructor
	public Second(int a,int b)
	{
		super(a,b);
		this.no1=a;
		this.no2=b;
		
	}
	
	private int no1;
	private int no2;
	private int sumAns;
	private int subAns;
	
	//Function to adding two numbers
	public int add()
	{
		sumAns=no1+no2;
		return sumAns;
	}
	
	//Function to subtract two numbers
	public int sub()
	{
		subAns=no1+no2;
		return subAns;
	}
}
