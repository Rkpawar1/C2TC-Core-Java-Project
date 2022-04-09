package com.tns.Application;
import com.tns.Framework.*;
public class Main {

	public static void main(String[] args) 
	{
		ShopFactory shop=new GSShopFactory();
		PrimeAcc prime= new GSPrimeAcc(1, "Pankaj", 1000, true);
		NormalAcc normal=new GSNormalAcc(2, "Ritesh", 1000,100.0f);
		
		prime.bookProduct(5000);
		normal.bookProduct(10000);
		
		System.out.println(prime.toString());
		System.out.println();
		System.out.println(normal.toString());
	

	}

}
