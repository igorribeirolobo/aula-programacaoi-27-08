package Aula;

public class funcoes {
	
	public double divide()
	{
		double x = 9/2;
		return x;
	}
	
	public long converterlong()
	{
		int num1 = 55555;
		int num2 = 66666;
		
		long num3 = (long)num1 * num2;
		
		return num3;
	}
	
	public int converterInt()
	{
		int myInt;
		double myPercent = 52.9;
		
		return myInt = (int)myPercent;
	}
	
	public byte converterByte()
	{
		int num1 = 53;
		int num2 = 47;
		byte num3;
		
		return num3 = (byte) (num1 + num2);
    }
	
	public short promocaoAutomatica()
	{
		short a,b,c;
		a = 1;
		b = 2;
		
		return c = (short) (a + b);
	}
	
	public long Person()
	{
		int ageYears = 32;
		int ageDays = ageYears * 365;
		long ageSeconds = ageYears * 365 * 24L * 60 * 60;
		
		return ageSeconds;
		
	}
	
	public int parseString()
	{
		String texto = "2";
		String texto1 = "1";
		int texto2 = Integer.parseInt(texto) + Integer.parseInt(texto1) ;
		
		return texto2;
	   
	}
}
