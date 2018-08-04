
public class CheckDemo {

	public static void main(String[] args) {
		
		Check check=new Check();
		System.out.println(check.no0); //printing the default variable
		System.out.println(check.getNo1()); //printing the private variable
		System.out.println(check.no2); //printing the protected variable
		System.out.println(check.no3); //printing the public variable
	}

}
