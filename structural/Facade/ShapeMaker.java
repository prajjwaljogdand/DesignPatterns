public class ShapeMaker 
{
	private Shape circle;
   	private Shape rectangle;
   	private Shape square;
	private Triangle T;

   	public ShapeMaker() 
	{
      		circle = new Circle();
      		rectangle = new Rectangle();
      		square = new Square();
		T=new Triangle();
		
   	}
	public void drawTriangle()
	{
		T.draw();
	}

   	public void drawCircle()
	{
      		circle.draw();
   	}
   	public void drawRectangle()
	{
      		rectangle.draw();
   	}
   	public void drawSquare()
	{
      		square.draw();
   	}
}