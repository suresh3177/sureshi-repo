package com.habitat.model;

import com.habitat.util.HabitatType;

public class PetHomeHabitat extends Habitat
{
	public static Animal[] petHomeAnimals = new Animal[2];

	public PetHomeHabitat(String name, int capacity)
	{
		super(name, capacity, HabitatType.PETHOME);

	}

	public String showHabitatDetails()
	{

		String details = "PetHomeHabitat ->  Name: " + name + " Capacity: " + capacity + " HabitatType: " + type;
		System.out.println(details);
		return details;

	}

	public void showPetHomeAnimals()
	{

		for (Animal x : petHomeAnimals)
		{
			System.out.println("PetHomeHabitat -> AnimalName: " + x.name);
		}
	}
}
