package com.tns.Application;
import com.tns.Framework.*;
public class GSNormalAcc extends NormalAcc
{

	
	public GSNormalAcc(int accno, String accNm, float charges, float f)
	{
		super(accno, accNm, charges, charges);
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
