package com.tns.Framework;

public abstract class NormalAcc extends ShopAcc
{
	private final float deliveyCharges=100.0f;
	float charges;
	
	public float getDeliveyCharges() 
	{
		return deliveyCharges;
	}

	
	public NormalAcc(int accno, String accNm, float charges, float charges2) 
	{
		super(accno, accNm, charges);
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
		return "Dear Normal user, Your charges are: " +charges+ " with Delivery Charges is : "+ deliveyCharges ;
	}
	
}
