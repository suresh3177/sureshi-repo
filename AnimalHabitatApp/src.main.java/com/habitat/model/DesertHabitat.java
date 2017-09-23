package com.habitat.model;

import com.habitat.util.HabitatType;

public class DesertHabitat extends Habitat
{

	public static Animal[] desertAnimals = new Animal[1];

	public DesertHabitat(String name, int capacity)
	{
		super(name, capacity, HabitatType.DESERT);

	}

	public String showHabitatDetails()
	{

		String details = "DesertHabitat ->  Name: " + name + " Capacity: " + capacity + " HabitatType: " + type;
		System.out.println(details);
		return details;

	}

	public void showDesertAnimal()
	{

		for (Animal x : desertAnimals)
		{
			System.out.println("DesertHabitat -> AnimalName: " + x.name);
		}
	}
}
