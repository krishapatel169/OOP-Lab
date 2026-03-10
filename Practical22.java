import java.util.Scanner;
class Shape
{
	double d1,d2;
	void getData(double d1,double d2)
	{
		this.d1=d1;
		this.d2=d2;
	}
}
class Triangle extends Shape
{
	double getArea()
	{
		return 0.5*d1*d2;	
	}
}
class Rectangle extends Shape
{
	double getArea()
	{
		return d1*d2;	
	}
}
class Practical22
{
	public static void main(String args[])
	{
		System.out.println("KRISHA : 250393107009");
		Triangle t = new Triangle();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the D1 for triangle: ");
		double d1 = sc.nextDouble();
		System.out.print("Enter the D2 for triangle: ");
		double d2 = sc.nextDouble();
		t.getData(d1,d2);
		double area = t.getArea();
		System.out.println("Area of Triangle= "+area);

		Rectangle r = new Rectangle();
		r.getData(d1,d2);
		area = r.getArea();
		System.out.println("Area of Rectangle= "+area);
		
	}
}