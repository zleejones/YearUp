
public class CalculateArea 
{

	public static void main(String[] args) 
	{
	double x = CalculateCircleArea(8);
	System.out.println(x);
	x = CalculateRectangleArea(8, 4);
	System.out.println(x);
	}
	static double CalculateCircleArea(int radius)	 
	{
		return radius * radius * Math.PI;
	}
	static double CalculateRectangleArea(int length, int breadth)
	{
		return length * breadth;
	}
	
}