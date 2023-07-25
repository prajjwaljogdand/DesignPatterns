public class Pentagon extends Shape
{
	public Pentagon(Color c)
	{
		super(c);
	}
	public void applyColor()
	{
		System.out.print("Thins is Pentagon, FIlled with color ");
		color.applyColor();
	}

}