//OverRidding the function by using reference of the parent class
public class ShapeDemo {

	public static void main(String[] args) {
		
		Shape circle=new Circle();
		circle.draw();
		
		Shape rectangle=new Rectangle();
		rectangle.draw();
		
		Shape polygon=new Polygon();
		polygon.draw();
		
		
		
				
	}

}
