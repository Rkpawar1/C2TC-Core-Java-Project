package com.tns.Application;
import com.tns.Framework.*;
public class GSPrimeAcc extends PrimeAcc
{

    private static final float Charges=0;
    
	public float getCharges() 
	{
		return Charges;
	}
	public GSPrimeAcc(int accno, String accNm, float charges, boolean isPrime)
	{
		super(accno, accNm, charges, isPrime, charges );
		// TODO Auto-generated constructor stub
	}
	@Override
	public void bookProduct(float p)
	{
		// TODO Auto-generated method stub
		super.bookProduct(p);
	}
	@Override
	public String toString() 
	{
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}
