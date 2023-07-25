public class Triangle extends Shape
{
	public Triangle(Color c)
	{
		super(c);
	}
	public void applyColor()
	{
		System.out.print("Thins is Traingle, FIlled with color ");
		color.applyColor();
	}

}