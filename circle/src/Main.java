
public class Main {

	public static void main(String[] args) 
	{
		Circle bigCircle = new Circle(10);
		double bigCircleArea = bigCircle.CalculateArea();
		System.out.println("big cirlce's area is " + bigCircleArea);
		bigCircle.PrintColor();
		
		Circle smallCircle = new Circle(5, "purple");
		double smallCircleArea = smallCircle.CalculateArea();
		System.out.println("samll circle's area is " + smallCircleArea);
		smallCircle.PrintColor();
		

	}
	
}
