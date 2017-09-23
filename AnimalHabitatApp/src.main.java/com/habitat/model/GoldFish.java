package com.habitat.model;


public class GoldFish extends Animal
{

	public GoldFish(String name, String type)
	{
		super(name, type);
	}

	public void showDetails()
	{
		System.out.println("The goldfish is a freshwater fish");
	}

}