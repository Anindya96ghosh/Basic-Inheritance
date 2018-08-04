//child class extending class'Second'
public class Third extends Second {
	
	public Third(int a,int b)
	{
		super(a,b);
		this.no1=(double)a;
		this.no2=(double)b;
		
	}
	
	private double no1;
	private double no2;
	private double powSum;
	private double modAns;
	
	//Function to implement pow function
	public double power()
	{
		powSum=Math.pow(no1,no2);
		return powSum;
	}
	
	//Function to implement an arithmetic expression
	public double mod()
	{
		modAns=2*(no1+no2);
		return modAns;
	}

}
