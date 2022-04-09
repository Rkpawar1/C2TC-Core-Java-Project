package com.tns.Framework;

public abstract class PrimeAcc extends ShopAcc
{
	private boolean isPrime=true;
	float charges;
	private static final float deliveryCharges=0;
	
	public boolean isPrime()
	{
		return isPrime;
	}
	
	public static float getDeliverycharges()
	{
		return deliveryCharges;
	}

	public PrimeAcc(int accno, String accNm, float charges, boolean isPrime, float charges2) {
		super(accno, accNm, charges);
		this.isPrime = isPrime;
		this.charges = charges;
	}

	@Override
	public void bookProduct(float p) 
	{
		// TODO Auto-generated method stub
		System.out.println();
	}

	@Override
	public String toString() 
	{
		// TODO Auto-generated method stub
		return "Dear Prime user, Your Product charges are: " +charges;
	}

	
}
