package com.habitat.model;

import com.habitat.util.HabitatType;

public class WaterHabitat extends Habitat
{

	public static Animal[] waterAnimals = new Animal[2];

	public WaterHabitat(String name, int capacity)
	{
		super(name, capacity, HabitatType.WATER);

	}

	public String showHabitatDetails()
	{

		String details = "WaterHabitat ->  Name:" + name + " Capacity: " + capacity + " HabitatType: " + type;

		System.out.println(details);
		return details;

	}

	public void showWaterAnimals()
	{

		for (Animal x : waterAnimals)
		{
			System.out.println("WaterHabitat -> AnimalName: " + x.name);
		}
	}

}
