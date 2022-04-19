package com.tns.Framework;

public abstract class ShopAcc 
{
	private int Accno;
        private String AccNm;
        private float charges;
	public int getAccno() {
		return Accno;
	}
	public void setAccno(int accno) 
	{
		Accno = accno;
	}
	public String getAccNm()
	{
		return AccNm;
	}
	public void setAccNm(String accNm) 
	{
		AccNm = accNm;
	}
	public float getCharges()
	{
		return charges;
	}
	public void setCharges(float charges)
	{
		this.charges = charges;
	}
	public ShopAcc(int accno, String accNm, float charges) 
	{
	
		this.Accno = accno;
		this.AccNm = accNm;
		this.charges = charges;
	}
	 public void bookProduct(float p)
	 {
      
	 }
	 
	 public void item(float value)
	 {
		
	 }
	 public String toString() 
	  {
           return AccNm;
	  }
   
    
    
}
