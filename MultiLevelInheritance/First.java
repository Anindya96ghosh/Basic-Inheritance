//Parent class
public class First {
	
	//No Args Constructor
	public First()
	{
		
	}
	
	//Parameterized Constructor
	public First(int no1,int no2)
	{
		this.no1=no1;
		this.no2=no2;
		
	}
	private int no1;
	private int no2;
	private int divAns;
	private int mulAns;
	
	//Function to divide two numbers
	public int div()
	{
		divAns=no1/no2;
		return divAns;
	}
	
	//Function to multiply two numbers
	public int mul()
	{
		mulAns=no1*no2;
		return mulAns;
	}
	
	
	
}
