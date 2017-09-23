package com.habitat.model;

public class Cat extends Animal
{

	public Cat(String name, String type)
	{
		super(name, type);
	}

	public void showDetails()
	{
		System.out.println("The domestic cat is a small, typically furry, carnivorous mammal.");
	}

}
