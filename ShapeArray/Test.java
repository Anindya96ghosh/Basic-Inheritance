
public class Test {

	public static void main(String[] args) {
		Shape shape[]=new Shape[3];
		shape[0]=new Rectangle();
		shape[1]=new Circle();
		shape[2]=new Triangle();
		
		for(int i=0;i<3;i++)
		{
			shape[i].draw();
		}

	}

}
