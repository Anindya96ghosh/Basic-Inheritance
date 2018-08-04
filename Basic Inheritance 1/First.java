//Parent class
public class First {
	//No args constructor
	public First()
	{
		
	}
	//Parameterised Constructor
	public First(int no1,int no2)
	{
		this.no1=no1;
		this.no2=no2;
		
	}
	private int no1;
	private int no2;
	private int divAns;
	private int mulAns;
	public int div()
	{
		divAns=no1/no2;
		return divAns;
	}
	
	public int mul()
	{
		mulAns=no1*no2;
		return mulAns;
	}
	
	
	
}
