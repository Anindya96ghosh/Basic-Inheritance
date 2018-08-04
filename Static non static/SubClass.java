
public class SubClass {

	static private int var1=10;
	private int var2=5;
	static private int var3=5;
	
	//non static function to add two numbers
	public int add()
	{
		int ans=var1+var2;
		return ans;
	}
	//static function to sub two numbers
	public static int sub()
	{
		int ans=var1-var3;
		return ans;
	}
}
