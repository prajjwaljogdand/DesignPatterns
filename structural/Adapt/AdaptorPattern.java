import java.io.*;
public class AdaptorPattern
{
	public static void main(String args[])
	{
		SocketAdaptor s=new SocketClassAdaptor();
		Volt v5=getVolt(s,12);
		System.out.println(v5.getVolts());
	}
	private static Volt getVolt(SocketAdaptor s,int i) 
	{
		switch(i)
		{
			case 5: return s.get5Volt(); 
			case 12: return s.get12Volt(); 
			case 220:return s.get220Volt();
			default: return s.get220Volt(); 
		}
	}
}