
public class TestCircle {
	public static void main(String args[])
	{
	Circle c1=new Circle();
	System.out.println("The circle radius is" + c1.getRadius() + "and area is" + c1.getArea() + "and circumference is" + c1.getCircumference() );
	Circle c2=new Circle(2.0);
	System.out.println("The circle radius is" + c2.getRadius() + "and area is" + c2.getArea() + "and circumference is" + c2.getCircumference() );
	}
	}
