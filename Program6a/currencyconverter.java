package Program6a;
import Program6a.*;
public class currencyconverter 
{
	public static void main(String[] args)
	{
		Dollar d = new Dollar();
		d.INRtoUSD();
		d.USDtoINR();
		Euro e = new Euro();
		e.INRtoEUR();
		e.EURtoINR();
		Yen y = new Yen();
		y.INRtoJPY();
		y.JPYtoINR();
	}
}
