
public class Parent {

	public Parent()
	{
		
	}
	public Parent(int no1,int no2)
	{
		this.no1=no1;
		this.no2=no2;
	}
	private int no1;
	private int no2;
	private int ans;
	
	public int add()
	{
		ans=no1+no2;
		return ans;
	}
}
