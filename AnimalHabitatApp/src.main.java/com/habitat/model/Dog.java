package com.habitat.model;

public class Dog extends Animal
{

	public Dog(String name, String type)
	{
		super(name, type);
	}

	public void showDetails()
	{
		System.out.println("Dogs are domesticated mammals, not natural wild animals.");
	}

}
