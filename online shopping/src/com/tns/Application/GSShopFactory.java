package com.tns.Application;
import com.tns.Framework.*;
public class GSShopFactory extends ShopFactory
{

	@Override
	public PrimeAcc getNewPrimeAccount(int accNo, String accNm, float charges, boolean isPrime) 
	{
		// TODO Auto-generated method stub
		GSPrimeAcc GsPrime = new GSPrimeAcc(accNo, accNm, charges, isPrime);
		System.out.println(GsPrime.toString());
		return GsPrime;
		
	}

	@Override
	public NormalAcc getNewNormalAccount(int accNo, String accNm, float charges, boolean isPrime) 
	{
		// TODO Auto-generated method stub
		GSNormalAcc GsNormal = new GSNormalAcc(accNo, accNm, charges, charges);
		System.out.println(GsNormal.toString());
		return GsNormal;
	}
  
}
