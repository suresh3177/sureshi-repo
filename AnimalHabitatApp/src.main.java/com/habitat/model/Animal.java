package com.habitat.model;

public abstract class Animal
{
	String name;
	String Type;

	public Animal(String name, String type)
	{
		this.name = name;
		this.Type = type;
	}

	public void isAnimal()
	{
		System.out.println("Yes , Animal");
	}

	public abstract void showDetails();

}
