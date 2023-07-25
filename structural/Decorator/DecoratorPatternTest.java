public class DecoratorPatternTest 
{

	public static void main(String[] args) 
	{
		Car sc= new BasicCar();
		sc.assemble();
		System.out.println("\n*****");
		Car sc1= new SportsCar(new BasicCar());
		sc1.assemble();
		System.out.println("\n*****");
		Car sc2= new LuxuryCar(new BasicCar());
		sc2.assemble();
		System.out.println("\n*****");
		Car SLC = new SportsCar(new LuxuryCar(new BasicCar()));
		SLC.assemble();
		System.out.println("\n*****");
		Car SLC1 = new LuxuryCar(new SportsCar(new BasicCar()));
		SLC1.assemble();
	
	}

}