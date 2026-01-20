class Rectangle
{
	double height;
	double width;
	Rectangle()
	{
		height=1;
		width=1;
	}
	Rectangle(double h, double w)
	{
		height=h;
		width=w;
	}
	void getArea()
	{
		System.out.println("Area="+(height*width));
	}
	void getPerimeter()
	{
		System.out.println("Perimeter="+(2*(height+width)));	
	}
	public static void main(String args[])
	{
		double h=Double.parseDouble(args[0]);
		double w=Double.parseDouble(args[1]);

		Rectangle r1=new Rectangle();
		Rectangle r2=new Rectangle(h,w);
		r1.getArea();
		r1.getPerimeter();
		r2.getArea();
		r2.getPerimeter();
	}
}