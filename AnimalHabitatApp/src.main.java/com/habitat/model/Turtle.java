package com.habitat.model;


public class Turtle extends Animal
{

	public Turtle(String name, String type)
	{
		super(name, type);
	}

	public void showDetails()
	{
		System.out.println("Turtles are reptiles with hard shells that protect them from predators.");
	}

}
