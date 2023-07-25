public class SocketClassAdaptor extends Socket implements SocketAdaptor 
{
	public Volt get220Volt()
	{
		return getVolt();
	}	
	public Volt get12Volt()
	{
		Volt v=getVolt();
		return ConvertVolt(v,10);
	}	

	public Volt get5Volt()
	{
		Volt v=getVolt();
		return ConvertVolt(v,44);
	}	


	private Volt ConvertVolt(Volt v, int c)
	{
		return new Volt(v.getVolts()/c);
	}


}