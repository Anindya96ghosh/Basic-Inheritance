
//abstract parent class
abstract class First 
{
	private int no;
	//parameterized constructor
	public First(int no)
	{
		this.no=no;
	}
	private int fact=1;
	
	//function to find factorial
	public int factorial()
	{
			for(int i=1;i<=no;i++)
				{
				fact=fact*i;
				
				}
			return fact;
	}
}