//Child class
class Second extends First{

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
	//adding two numbers
	public int add()
	{
		sumAns=no1+no2;
		return sumAns;
	}
	//subtracting two number
	public int sub()
	{
		subAns=no1+no2;
		return subAns;
	}
}
