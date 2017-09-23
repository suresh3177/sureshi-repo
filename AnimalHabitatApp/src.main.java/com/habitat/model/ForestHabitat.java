package com.habitat.model;

import com.habitat.util.HabitatType;

public class ForestHabitat extends Habitat
{

	public static Animal[] forestAnimals = new Animal[1];

	public ForestHabitat(String name, int capacity)
	{
		super(name, capacity, HabitatType.FOREST);

	}

	public String showHabitatDetails()
	{

		String details = "ForestHabitat ->  Name: " + name + " Capacity: " + capacity + " HabitatType: " + type;
		System.out.println(details);
		return details;

	}

	public void showForestAnimal()
	{

		for (Animal x : forestAnimals)
		{
			System.out.println("ForestHabitat -> AnimalName: " + x.name);
		}
	}
}
